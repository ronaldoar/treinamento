package br.com.rar.treinamento.linguagem;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Robo {
	
	private Integer id;
	private String nome;
	private static boolean ativo = true;
	private LocalDateTime dataHora;
	

	
	public Robo(Integer id, String nome, LocalDateTime dataHora) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataHora = dataHora;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public static boolean isAtivo() {
		return ativo;
	}
	public static void setAtivo(boolean ativo) {
		Robo.ativo = ativo;
	}
	
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
//	public static List<Robo> fabricarRobos(){
//		List<Robo>list = new ArrayList<Robo>();
//		list.add(new Robo(1,"Robo-1", true));
//		list.add(new Robo(2,"Robo-2", true));
//		list.add(new Robo(3,"Robo-3", true));
//		return list;
//	}
	
	@Override
	public String toString() {
		return "Robo [id=" + id + ", nome=" + nome + ", ativo=" + ativo + ", dataHora=" + dataHora + "]";
	}
	
	
	
}
