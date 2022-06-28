package com.baconapp.springboot.backend.apirest.models.entity;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;


import org.junit.jupiter.api.Test;

class ClienteTest {

	Cliente cliente = new Cliente(1L, "Alberto", "Rosales", "baconwp@yahoo.com", false, new Date());

	@Test
	void testNombre() {

		// This is usted to test the nombre
		Cliente cliente = new Cliente(1L, "Alberto", "Rosales", "baconwp@yahoo.com", false, new Date());

		String wait = "Alberto";
		String isTrue = cliente.getNombre();

		assertEquals(wait, isTrue);
	}

	@Test
	void testApellido() {

		// This is usted to test the Apelliod
		Cliente cliente = new Cliente(1L, "Alberto", "Rosales", "baconwp@yahoo.com", false, new Date());

		String wait = "Rosales";
		String isTrue = cliente.getApellido();

		assertEquals(wait, isTrue);

	}

	@Test
	void testEmail() {

		// This is usted to test the E-Mail
		Cliente cliente = new Cliente(1L, "Alberto", "Rosales", "baconwp@yahoo.com", false, new Date());

		String wait = "baconwp@yahoo.com";
		String isTrue = cliente.getEmail();

		assertEquals(wait, isTrue);
	}

	@Test
	void testIsDeleted() {

		// This is usted to test the E-Mail
		Cliente cliente = new Cliente(1L, "Alberto", "Rosales", "baconwp@yahoo.com", false, new Date());

		boolean wait = false;
		boolean isTrue = cliente.isDeleted();

		assertEquals(wait, isTrue);		
		
	}

	@Test
	void testDate() {

		// This is usted to test the E-Mail
		new Cliente(1L, "Alberto", "Rosales", "baconwp@yahoo.com", false, new Date());

		Date date = new Date();
		Date correctdate = new Date();		
	
		assertEquals(date, correctdate);
	}
	
	
	@Test
	void testReferenciaCliente() {
		Cliente cliente = new Cliente(1L, "Alberto", "Rosales", "baconwp@yahoo.com", false, new Date());
		Cliente cliente2 = new Cliente(1L, "Alberto", "Rosales", "baconwp@yahoo.com", false, new Date());
		
		//assertNotEquals(cliente2, cliente);
		assertEquals(cliente2, cliente);
		
	}

}
