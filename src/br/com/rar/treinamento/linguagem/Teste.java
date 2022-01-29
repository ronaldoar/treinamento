package br.com.rar.treinamento.linguagem;

public class Teste {
	
	public static void main(String[] args) {
		
//		if(lerArquivo() && lerDatabase()) {
//			System.out.println("leu os dois");
//		}
		
		if(lerArquivo() | lerDatabase()) {
			System.out.println("leu um só");
		}
	}
	
	
	public static boolean lerArquivo() {
		System.out.println("Lendo o arquivo....");
		return true;
	}
	
	public static boolean lerDatabase() {
		System.out.println("Lendo o database....");
		return true;
	}
}
