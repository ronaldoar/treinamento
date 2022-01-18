package br.com.rar.treinamento.linguagem;

public class CondicaoSwitchCase {
	
	public static String diaSemana(int diaSemana) {
		String dia;
		
		switch(diaSemana) {
			case 1:
				dia = "Segunda";
				 break;
			case 2:
				dia = "Terça";
				break;
			case 3:
				dia = "Quarta";
				break;
			case 4:
				dia = "Quinta";
				break;
			case 5:
				dia = "Sexta";
				break;
			case 6:
				dia = "Sábado";
				break;
			case 7: 
				dia = "Domingo";
			default:
				throw new IllegalArgumentException("Não é um dia da semana válido.");
		}
		return dia;
	}
}
