package com.example.entrevueSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entrevueSpringBoot.entities.Acteur;

public interface ActeurRepository extends JpaRepository<Acteur, Long> {

}
