package com.example.entrevueSpringBoot.services;

import com.example.entrevueSpringBoot.models.FilmDTO;

public interface IFilmService {

	public FilmDTO getFilmById(long id);

	public FilmDTO addFilm(FilmDTO filmDTO);
}
