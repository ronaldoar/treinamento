package br.com.rar.treinamento.modelo;

import java.util.List;

public class Revisao {
	
	public void imprimirTipoCambio(List<Veiculo>veiculos) {
		for(Veiculo v : veiculos) {
			System.out.println(v.getCambio());
		}
	}
}
