package br.com.rar.treinamento.executavel;

import java.time.LocalDateTime;
import java.util.List;

import br.com.rar.treinamento.linguagem.Robo;

public class RoboExec {

	public static void main(String[] args) {
		
		
		Robo r1 = new Robo(1,"Robo-1", LocalDateTime.now());
		Robo r2 = new Robo(2,"Robo-2", LocalDateTime.now());
		Robo r3 = new Robo(3,"Robo-3", LocalDateTime.now());
		
		r1.setDataHora(null);
		r2.setDataHora(null);
		r3.setDataHora(null);
		
		r1.setNome("ROBO-5");
		
		Robo.setAtivo(false);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
//		List<Robo>robos = Robo.fabricarRobos();
//		
//		for(Robo r : robos) {
//			System.out.println(r);
//		}
	}
}
