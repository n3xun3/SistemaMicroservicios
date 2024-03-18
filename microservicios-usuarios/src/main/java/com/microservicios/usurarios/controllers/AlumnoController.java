package com.microservicios.usurarios.controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservicios.commons.alumnos.model.entity.Alumno;
import com.microservicios.commons.controllers.CommonController;
import com.microservicios.usurarios.services.AlumnoService;

@RestController
public class AlumnoController extends CommonController<Alumno,AlumnoService>{
	
	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@RequestBody Alumno alumno, @PathVariable Long id){
		Optional<Alumno> o = service.findById(id);
		
		if(o.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		Alumno alumnodb = o.get();
		alumnodb.setNombre(alumno.getNombre());
		alumnodb.setApellido(alumno.getApellido());
		alumnodb.setEmail(alumno.getEmail());
		
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(alumnodb));
	}
	
	@GetMapping("/filtrar/{term}")
	public ResponseEntity<?> filtrar(@PathVariable String term){
		return ResponseEntity.ok(service.findByNombreOrApellido(term));
	}
	
}
