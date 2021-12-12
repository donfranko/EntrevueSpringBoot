package com.example.entrevueSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entrevueSpringBoot.entities.Film;

public interface FilmRepository extends JpaRepository<Film, Long> {

}
