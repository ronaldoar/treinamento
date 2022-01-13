package br.com.rar.treinamento.linguagem;

public class CondicaoIf {
	
	/**
	 * Efetua testes encadeado de IF/ELSE
	 * @param notaProva
	 */
	public void exemploUm(int notaProva) {
	
		if(notaProva == 0) {
			System.out.println("Aluno reprovado!");
			
		}else if(notaProva < 5) {
			System.out.println("Aluno em recuperação!");
			
		}else if(notaProva <= 7) {
			System.out.println("Aluno fará nova avaliação!");
			
		}else if(notaProva > 7) {
			System.out.println("Aluno aprovado!");
		}
	}
	
	/**
	 * Efetua testes booleanos combinados
	 */
	public void exemploDois() {
		
		boolean a = false;
		boolean b = false;
		
		a = true; b = false;
		
		if(a || b) {//teste o lado esquerdo do sinal
			imprime(0, a, b, "||");
		}
		

		a = false; b = true;
		
		if(a | b) {//teste o lado direito do sinal
			imprime(1, a, b, "|");
		}else {
			
		}
		
		
		a = true; b = true;
		
		if(a && b) {//teste os dois lados
			imprime(2, a, b, "&&");
		}
		
		
		a = false; b = true;
		
		if(a | b) {//testa o esquerdo
			imprime(1, a, b, "|");
		}else {
			imprime(3, a, b, "|");
		}
		
		
		a = false; b = true;
		
		if(a && b) {//teste os dois lados
			System.out.println("nao deve entrar aqui!");
		}else {
			imprime(3, a, b, "&&");
		}
		
		
		a = false; b = true;
		
		if(a & b) {//teste os dois lados
			System.out.println("nao deve entrar aqui!");
		}else {
			imprime(3, a, b, "&");
		}
		
		
	}
	
	/*
	 * Para 0 = testou o lado esquerdo
	 * Para 1 = testou o lado direito
	 * Para 2 = testou qualquer um dos lados
	 * @param codigo
	 */
	private void imprime(int codigo, boolean a, boolean b, String sinal) {
		
		String esquerdo  = "[passou no direito]: " 	  +"( "+ sinal +" ) "+ a+ ", "+b;
		String direito   = "[passou no esquerdo]: "   +"( "+ sinal +" ) "+ a+ ", "+b;
		String doisLados = "[passou nos dois]: " 	  +"( "+ sinal +" ) "+ a+ ", "+b;
		String nenhum    = "[nao passou em nenhum]: " +"( "+ sinal +" ) "+ a+ ", "+b;
		
		if(codigo == 0)System.out.println(esquerdo);
		if(codigo == 1)System.out.println(direito);
		if(codigo == 2)System.out.println(doisLados);
		if(codigo == 3)System.out.println(nenhum);
	}
}
