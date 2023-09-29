package com.fatec.projeto1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Exemplo2 {
	private Collection<Object> collection;
	@BeforeEach
	public void setup() {
		collection = new ArrayList<>();
		System.out.println("Executou o beforeEach");
	}
	
	@Test
	void ct01_verifica_colecao_vazia() {
		assertTrue(collection.isEmpty());
	}
	
	@Test
	void ct02_verifica_inclusao_de_um_item() {
		collection.add("item");
		assertEquals(1, collection.size());
	}

}
