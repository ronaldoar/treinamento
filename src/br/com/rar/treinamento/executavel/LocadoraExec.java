package br.com.rar.treinamento.executavel;

import br.com.rar.treinamento.modelo.EncaminhaVeiculos;
import br.com.rar.treinamento.modelo.FazRevisao;
import br.com.rar.treinamento.modelo.Ferrari;
import br.com.rar.treinamento.modelo.Gol;
import br.com.rar.treinamento.modelo.Parati;
import br.com.rar.treinamento.modelo.Saveiro;
import br.com.rar.treinamento.modelo.Veiculo;

public class LocadoraExec {
	
	public static void main(String[] args) {
		
		
		EncaminhaVeiculos.adicionar(new Gol());
		EncaminhaVeiculos.adicionar(new Parati());
		EncaminhaVeiculos.adicionar(new Saveiro());
		EncaminhaVeiculos.adicionar(new Ferrari());
		
		for(Veiculo v : EncaminhaVeiculos.getListaVeiculos()) {
			FazRevisao.revisar(v);
		}
		
		new FazRevisao().confirmarRevisao(EncaminhaVeiculos.getListaVeiculos());
		
	}
}
