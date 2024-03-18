package com.microservicios.cursos.services;

import com.microservicios.commons.services.CommonService;
import com.microservicios.cursos.models.entity.Curso;

public interface CursoService extends CommonService<Curso> {

	public Curso findCursoByAlumnoId(Long id);
}
