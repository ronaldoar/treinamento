package br.com.rar.treinamento.linguagem;

import java.util.ArrayList;
import java.util.List;

public class CondicaoFor {
	
	
	/**
	 * Itera de forma primitiva
	 */
	public static void forSimples() {
		
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
		
		System.out.println("---------------------------------------------");
		
		for(int i=5; i>0; i--) {
			System.out.println(i);
		}
	}
	
	/**
	 * Itera de forma moderna
	 */
	public static void forEach() {
		
		List<String>cidades = new ArrayList<String>();
		
		cidades.add("Borbocity");
		cidades.add("São Paulo");
		cidades.add("Novo Horizonte");
		cidades.add("Ibitinga");
		
		for(String cidade : cidades) {
			System.out.println(cidade);
		}
		
	}
}
