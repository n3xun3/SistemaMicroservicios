package com.microservicios.usurarios.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.microservicios.commons.alumnos.model.entity.Alumno;
import com.microservicios.commons.services.CommonServiceImpl;
import com.microservicios.usurarios.models.repository.AlumnoRepository;



@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements AlumnoService {

	@Override
	@Transactional(readOnly = true)
	public List<Alumno> findByNombreOrApellido(String term) {
		
		return repository.findByNombreOrApellido(term);
	}
	
	
}
