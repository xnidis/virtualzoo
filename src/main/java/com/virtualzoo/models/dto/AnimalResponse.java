package com.virtualzoo.models.dto;

import java.util.List;

public class AnimalResponse {
	private String id;
	private String name;
	private String species;
	private List<String> tricks;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public List<String> getTricks() {
		return tricks;
	}

	public void setTricks(List<String> tricks) {
		this.tricks = tricks;
	}
}
