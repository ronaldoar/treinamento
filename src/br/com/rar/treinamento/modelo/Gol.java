package br.com.rar.treinamento.modelo;

import java.util.Objects;

public class Gol implements Veiculo {
	
	private String placa;
	private int anoFabricacao;
	private String modelo;
	private String fabricante;
	private String cambio;
	private boolean revisao;
	
	public Gol() {
		this.placa = "AXV1452";
		this.anoFabricacao = 2021;
		this.modelo = "Hatch";
		this.fabricante = "Wolksvagem";
		this.cambio = "manual";
	}
	
	@Override
	public String getPlaca() {
		return placa;
	}
	
	@Override
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	@Override
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	
	@Override
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	
	@Override
	public String getModelo() {
		return modelo;
	}
	
	@Override
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public String getFabricante() {
		return fabricante;
	}
	
	@Override
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	@Override
	public String getCambio() {
		return cambio;
	}
	
	@Override
	public void setCambio(String cambio) {
		this.cambio = cambio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(placa);
	}
	
	@Override
	public boolean isRevisao() {
		return revisao;
	}

	@Override
	public void setRevisao(boolean revisao) {
		this.revisao = revisao;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gol other = (Gol) obj;
		return Objects.equals(placa, other.placa);
	}

	@Override
	public String toString() {
		return "Gol [placa=" + placa + ", anoFabricacao=" + anoFabricacao + ", modelo=" + modelo + ", fabricante="
				+ fabricante + ", cambio=" + cambio + "]";
	}
}
