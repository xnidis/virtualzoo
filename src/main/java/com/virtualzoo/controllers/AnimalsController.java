package com.virtualzoo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.virtualzoo.models.dto.AnimalResponse;
import com.virtualzoo.models.dto.TrickResponse;
import com.virtualzoo.services.AnimalService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


//todo: add swagger

@RestController
@RequestMapping("myZoo/animals")
public class AnimalsController {

	@Autowired
	private AnimalService animalService;

	@GetMapping("/all")
	public Flux<AnimalResponse> getAnimals(@RequestParam(required = false) boolean orderBySpecies) {
		return animalService.getAnimals(orderBySpecies);
	}

	@GetMapping("/{animalId}/doTrick")
	public Mono<TrickResponse> getTricks(@PathVariable("animalId") String animalId) {
		return animalService.getAnimalTricks(animalId);
	}

}
