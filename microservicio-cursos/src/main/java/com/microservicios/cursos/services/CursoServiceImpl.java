package com.microservicios.cursos.services;

import org.springframework.stereotype.Service;

import com.microservicios.commons.services.CommonServiceImpl;
import com.microservicios.cursos.models.entity.Curso;
import com.microservicios.cursos.models.repository.CursoRepository;

@Service
public class CursoServiceImpl extends CommonServiceImpl<Curso, CursoRepository> implements CursoService {

	

}
