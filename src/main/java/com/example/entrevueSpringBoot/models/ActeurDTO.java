package com.example.entrevueSpringBoot.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ActeurDTO {

	private long id;
	private String nom;
	private String prenom;
}
