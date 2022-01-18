package br.com.rar.treinamento.modelo;

import java.util.ArrayList;
import java.util.List;

public class EncaminhaVeiculos {
	
	private static List<Veiculo>lst = new ArrayList<Veiculo>();
	
	public static void adicionar(Veiculo veiculo){
		lst.add(veiculo);
	}
	
	public static List<Veiculo> getListaVeiculos(){
		return lst;
	}
}
