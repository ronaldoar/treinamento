package br.com.rar.treinamento.modelo;

import java.util.List;

public class FazRevisao {
	
	public static void revisar(Veiculo v) {
		v.setRevisao(true);
	}
	
	public void confirmarRevisao(List<Veiculo>veiculos) {
		for(Veiculo v : veiculos) {
			System.out.println(
					"MODELO: "+v.getModelo() 
					+" FABRICANTE: "+v.getFabricante()
					+" REVISADO: "+v.isRevisao()
				);
		}
	}
}
