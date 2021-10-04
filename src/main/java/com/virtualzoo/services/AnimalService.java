package com.virtualzoo.services;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtualzoo.models.dto.AnimalResponse;
import com.virtualzoo.repository.AnimalRepository;

import reactor.core.publisher.Flux;

@Service
public class AnimalService {

	@Autowired
	private AnimalRepository animalRepository;

	public Flux<AnimalResponse> getAnimals() {

		return Flux.fromIterable(animalRepository.findAll().stream()
				.map(a -> {
					AnimalResponse animalResponse = new AnimalResponse();
					animalResponse.setId(a.getId());
					animalResponse.setName(a.getName());
					animalResponse.setSpecies(a.getSpecies().getDescription());
					return animalResponse;
				}).collect(Collectors.toList()));
	}
}
