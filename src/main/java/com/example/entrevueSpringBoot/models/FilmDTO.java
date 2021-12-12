package com.example.entrevueSpringBoot.models;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class FilmDTO {

	private long id;
	private String titre;
	private String description;
	private List<ActeurDTO> acteurs;

	public FilmDTO() {
		this.titre = new String();
		this.description = new String();
		this.acteurs = new ArrayList<ActeurDTO>();
	}
}
