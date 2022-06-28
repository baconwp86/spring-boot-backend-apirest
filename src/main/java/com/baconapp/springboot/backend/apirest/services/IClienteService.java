package com.baconapp.springboot.backend.apirest.services;

import java.util.List;

import com.baconapp.springboot.backend.apirest.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public Cliente findByid(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
	
	
	
	

}
