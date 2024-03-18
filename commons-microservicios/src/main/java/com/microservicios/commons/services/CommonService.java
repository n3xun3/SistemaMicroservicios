package com.microservicios.commons.services;

import java.util.Optional;

public interface CommonService<E> {
	
	public Iterable<E> findAll();
	
	public Optional<E> findById(Long id);
	
	public E save(E Entity);
	
	public void deleteById(Long id);
}
