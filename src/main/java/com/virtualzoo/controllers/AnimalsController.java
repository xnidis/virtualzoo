package com.virtualzoo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.virtualzoo.models.dto.AnimalResponse;
import com.virtualzoo.services.AnimalService;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("myZoo")
public class AnimalsController {

	@Autowired
	private AnimalService animalService;

	@GetMapping("/animals/all")
	public Flux<AnimalResponse> getAnimals(@RequestParam(required = false) boolean orderBySpecies) {
		return animalService.getAnimals(orderBySpecies);
	}

}
