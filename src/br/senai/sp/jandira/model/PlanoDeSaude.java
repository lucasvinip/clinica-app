package br.senai.sp.jandira.model;

public class PlanoDeSaude {

	private String operadora;
	private String tipoDoPlano;
	
	// Métodos de acesso getters e setters
	
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	
	public String getOperadora() {
		return this.operadora;
	}
	
	// tipo do plano
	public void setTipoDoPlano(String TipoDoPlano) {
		this.tipoDoPlano = TipoDoPlano;
	}
	
	public String getTipoDoPlano() {
		return this.tipoDoPlano;
	}
	
	public String getDadosDoPlano() {
		return "Plano: " + this.operadora + ", " + this.tipoDoPlano;
	}
}
