package com.microservicios.cursos.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.microservicios.cursos.models.entity.Curso;

public interface CursoRepository extends CrudRepository<Curso, Long> {

}
