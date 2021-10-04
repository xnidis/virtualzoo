package com.virtualzoo.services;

import java.util.Random;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.virtualzoo.models.Animal;
import com.virtualzoo.models.Trick;
import com.virtualzoo.models.dto.AnimalResponse;
import com.virtualzoo.models.dto.TrickResponse;
import com.virtualzoo.repository.AnimalRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AnimalService {

	@Autowired
	private AnimalRepository animalRepository;

	public Flux<AnimalResponse> getAnimals(boolean orderBySpecies) {
		if (orderBySpecies)
			return getAnimalsOrderedBySpecies();

		return Flux.fromIterable(animalRepository.findAll().stream()
				.map(this::prepareAnimalResponse)
				.collect(Collectors.toList()));
	}

	public Mono<TrickResponse> getAnimalTricks(String animalId) {
		Animal animal = animalRepository.findById(animalId).get();
		return Mono.just(prepareTricksResponse(animal));
	}

	private Flux<AnimalResponse> getAnimalsOrderedBySpecies() {
		return Flux.fromIterable(animalRepository.findAll(Sort.by(Sort.Direction.ASC, "species_id")).stream()
				.map(this::prepareAnimalResponse)
				.collect(Collectors.toList()));

	}

	private AnimalResponse prepareAnimalResponse(Animal animal) {
		AnimalResponse response = new AnimalResponse();
		response.setId(animal.getId());
		response.setName(animal.getName());
		response.setSpecies(animal.getSpecies().getDescription());
		response.setTricks(animal.getTricks().stream()
				.map(Trick::getTrick)
				.collect(Collectors.toList()));
		return response;
	}

	private TrickResponse prepareTricksResponse(Animal animal) {
		TrickResponse response = new TrickResponse();
		Random randomGenerator = new Random();
		int idx = randomGenerator.nextInt(animal.getTricks().size());
		response.setTrick(animal.getTricks().get(idx).getTrick());
		return response;
	}
}
