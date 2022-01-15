package br.com.rar.treinamento.linguagem;

public class CondicaoArray {
	
	private String[]letras;
	
	/**
	 * Cria um array de inteiros
	 */
	public static void criar() {
		Integer[]numeros = new Integer[] {1,2,3,4,5};
		
		for(int i=0; i<=numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
	}
	
	/**
	 * obtem um valor do array baseado na posicao
	 * do elemento dentro do array
	 * @param posicao
	 */
	public static void pegarConteudo(int posicao) {
		Integer[]numeros = new Integer[] {1,2,3,4,5};
		int p = numeros[posicao];
		System.out.println(p);
	}
	
	
	public void percorrerArray() {
		letras = new String[] {"A","B","C","D"};
		
		for(int i=0; i<letras.length; i++) {
			System.out.println(letras[i]);
		}
	}
	
	public void atribuirValorNaPosicao(int posicao, String valor) {
		this.letras[posicao] = valor;
		System.out.println(this.letras);
	}
}
