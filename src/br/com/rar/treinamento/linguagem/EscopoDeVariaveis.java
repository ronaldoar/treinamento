package br.com.rar.treinamento.linguagem;

public class EscopoDeVariaveis {
	
	/*
	 * ESCOPO:
	 * local onde a variavel pode ser usada.
	 *  
	 */
	
	/* 
	 * variaveis com escopo de classe.
	 * Podem ser vistas em toda a classe.
	 * Quando a classe for executada e não 
	 * mais referenciada(alguma variavel estiver apontando para ela, essa classe deixa de exitir. 
	 */
	private Integer id;
	private int numeroCartao;
	
	public EscopoDeVariaveis() {
		System.out.println(this.id);
		System.out.println(this.numeroCartao);
		this.variavelLocal();
	}
	
	private void variavelLocal() {
		/*
		 * variaveis com escopo de metodo
		 * não podem ser vistas ou chamadas
		 * fora do metodo.
		 * Quando o metodo for executado
		 * essas variáveis deixam de exitir 
		 * 
		 */
		long anosLuz = 123311131333135889l;
		String planeta = "Terra";
		System.out.println(anosLuz);
		System.out.println(planeta);
		
	}
	
}
