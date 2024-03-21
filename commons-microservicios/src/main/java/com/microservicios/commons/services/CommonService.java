package com.microservicios.commons.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CommonService<E> {
	
	public Iterable<E> findAll();
	
	Page<E> findAll(Pageable pageable);
	
	public Optional<E> findById(Long id);
	
	public E save(E Entity);
	
	public void deleteById(Long id);
}
