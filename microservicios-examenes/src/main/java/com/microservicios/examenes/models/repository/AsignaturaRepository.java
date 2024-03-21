package com.microservicios.examenes.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.commons.examenes.models.entity.Asignatura;

public interface AsignaturaRepository extends JpaRepository<Asignatura, Long> {

}
