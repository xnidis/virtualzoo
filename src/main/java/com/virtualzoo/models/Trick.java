package com.virtualzoo.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "tricks")
public class Trick {
	@Id
	private Long id;
	private String trick;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTrick() {
		return trick;
	}

	public void setTrick(String trick) {
		this.trick = trick;
	}
}
