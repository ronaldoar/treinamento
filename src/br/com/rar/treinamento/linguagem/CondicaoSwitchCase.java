package br.com.rar.treinamento.linguagem;

public class CondicaoSwitchCase {
	
	public static String diaSemana(int diaSemana) {
		String dia;
		
		switch(diaSemana) {
			case 1:
				dia = "Segunda";
				 break;
			case 2:
				dia = "Ter�a";
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
				dia = "S�bado";
				break;
			case 7: 
				dia = "Domingo";
			default:
				throw new IllegalArgumentException("N�o � um dia da semana v�lido.");
		}
		return dia;
	}
}
