package com.microservicios.examenes.services;

import java.util.List;

import com.commons.examenes.models.entity.Asignatura;
import com.commons.examenes.models.entity.Examen;
import com.microservicios.commons.services.CommonService;

public interface ExamenService extends CommonService<Examen> {

	public List<Examen> findByNombre(String term);
	
	public Iterable<Asignatura> findAllAsignaturas();
;}
