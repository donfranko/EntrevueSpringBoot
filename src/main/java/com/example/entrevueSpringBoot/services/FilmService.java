package com.example.entrevueSpringBoot.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entrevueSpringBoot.entities.Acteur;
import com.example.entrevueSpringBoot.entities.Film;
import com.example.entrevueSpringBoot.models.ActeurDTO;
import com.example.entrevueSpringBoot.models.FilmDTO;
import com.example.entrevueSpringBoot.repositories.FilmRepository;

@Service("FilmService")
public class FilmService implements IFilmService {

	@Autowired
	private FilmRepository filmRepository;

	/*
	 * Get Film By id from H2 DB
	 */
	public FilmDTO getFilmById(long id) {
		Optional<Film> film = filmRepository.findById(id);
		FilmDTO filmDto = new FilmDTO();
		if (film.isPresent()) {
			BeanUtils.copyProperties(film.get(), filmDto);
		}
		return filmDto;
	}

	/*
	 * Add Film By id from H2 DB
	 */
	public FilmDTO addFilm(FilmDTO filmDTO) {
		Film film = new Film();
		film.setDescription(filmDTO.getDescription());
		film.setTitre(filmDTO.getTitre());
		film.setActeurs(new ArrayList<Acteur>());

		for (ActeurDTO acteurDto : filmDTO.getActeurs()) {
			Acteur acteur = new Acteur();
			acteur.setFilm(film);
			acteur.setNom(acteurDto.getNom());
			acteur.setPrenom(acteurDto.getPrenom());
			film.getActeurs().add(acteur);
		}

		filmRepository.save(film);
		return this.getFilmById(film.getId());
	}
}
