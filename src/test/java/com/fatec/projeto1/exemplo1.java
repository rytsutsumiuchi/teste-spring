package com.fatec.projeto1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class exemplo1 {

	@Test
	void ct01_verificar_o_comportamento_da_lista_vazia() {
		//dado que a lista foi inicializada
		List<String> lista = new ArrayList<>();
		//quando o usuario consulta o tamanho da lista
		int tamanho = lista.size();
		//enquanto a lista esta vazia
		assertEquals (0, tamanho);
	}
	
	@Test
	void ct02_verificar_o_comportamento_na_inclusao_de_um_item() {
		//dado que a lista foi inicializada
		List<String> lista = new ArrayList<>();
		//quando adiciono um item na lista
		lista.add("Jose");
		//entao é possivel consultar o item
		assertEquals("Jose", lista.get(0));
	}
	
	@Test
	void ct03_verificar_o_comportamento_na_inclusao_de_um_item() {
		//dado que a lista foi inicializada
		List<String> lista = new ArrayList<>();
		//quando adiciono um item na lista
		lista.add("Jose");
		//entao é possivel consultar o item
		assertTrue(lista.contains("Jose"));
		assertFalse(lista.contains("Maria"));
	}

}
