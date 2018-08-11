package br.com.personal.modelo;

public class TipoCombustivel {

	private String etanolComum;

	private String gasolinaComum;

	private String etanolAditivada;

	private String gasolinaAditivada;

	private String diesel;

	private String gas;

	private double valorLitroCombustivel;

	public double getValorLitroCombustivel() {
		return valorLitroCombustivel;
	}

	public void setValorLitroCombustivel(double valorLitroCombustivel) {
		this.valorLitroCombustivel = valorLitroCombustivel;
	}

	public String getEtanolComum() {
		return etanolComum;
	}

	public void setEtanolComum(String etanolComum) {
		this.etanolComum = etanolComum;
	}

	public String getGasolinaComum() {
		return gasolinaComum;
	}

	public void setGasolinaComum(String gasolinaComum) {
		this.gasolinaComum = gasolinaComum;
	}

	public String getEtanolAditivada() {
		return etanolAditivada;
	}

	public void setEtanolAditivada(String etanolAditivada) {
		this.etanolAditivada = etanolAditivada;
	}

	public String getGasolinaAditivada() {
		return gasolinaAditivada;
	}

	public void setGasolinaAditivada(String gasolinaAditivada) {
		this.gasolinaAditivada = gasolinaAditivada;
	}

	public String getDiesel() {
		return diesel;
	}

	public void setDiesel(String diesel) {
		this.diesel = diesel;
	}

	public String getGas() {
		return gas;
	}

	public void setGas(String gas) {
		this.gas = gas;
	}

}
