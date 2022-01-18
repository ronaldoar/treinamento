package br.com.rar.treinamento.executavel;

import br.com.rar.treinamento.linguagem.TiposPrimitivos;

public class TiposPrimitivosExec {
	
	public static void main(String[] args) {
		
		new TiposPrimitivos();
		
		System.out.println("-------------------------------");
		
		TiposPrimitivos tp = new TiposPrimitivos();
		tp.inicializandoValores();
		
		System.out.println("-------------------------------");
		
		System.out.println(tp.toString());
	}
}
