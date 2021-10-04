package com.virtualzoo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virtualzoo.models.dto.AnimalResponse;
import com.virtualzoo.services.AnimalService;

import reactor.core.publisher.Flux;

@RestController
public class AnimalsController {

	@Autowired
	private AnimalService animalService;

	@GetMapping("/animals")
	public Flux<AnimalResponse> getAnimals() {
		return animalService.getAnimals();
	}


}
