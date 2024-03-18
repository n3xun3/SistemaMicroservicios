package com.microservicios.usurarios.services;

import java.util.List;

import com.microservicios.commons.alumnos.model.entity.Alumno;
import com.microservicios.commons.services.CommonService;

public interface AlumnoService extends CommonService<Alumno>{
	
	public List<Alumno> findByNombreOrApellido(String term);
}
