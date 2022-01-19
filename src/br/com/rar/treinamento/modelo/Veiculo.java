package br.com.rar.treinamento.modelo;

public interface Veiculo {
	
	public String getPlaca(); 
	public void setPlaca(String placa);
	
	public int getAnoFabricacao();
	public void setAnoFabricacao(int anoFabricacao);
	
	public String getModelo();
	public void setModelo(String modelo);
	
	public String getFabricante();
	public void setFabricante(String fabricante);
	
	public String getCambio();
	public void setCambio(String cambio);
	
	public void setRevisao(boolean revisao);
	public boolean isRevisao();
}
