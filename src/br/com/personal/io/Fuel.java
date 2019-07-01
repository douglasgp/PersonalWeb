package br.com.personal.io;

import java.util.Calendar;

// We work on mondays but today is not monday it is tuesday

public class Fuel {

	private Long id;
	
	private int ccf; // Código do cupom fiscal

	private static int qtdCombustivel = 6; // Total de opções de combustíveis disponíveis para escolher
	
	private double valueLiter; // Valor por litro

	private double amount; // Valor total

	private int odo; // Km Atual

	private double dst; // Km Percorrido

	private double totalLiters; // Total de Litros
	
	private String levelReservoir; // Nível do reservatório

	private String dateSupplies; // Data de abastecimento
	
	public int vetorTypeFuel[] = new int[qtdCombustivel]; // Cód. de posição do combustível
	public String typeFuel[] = new String[qtdCombustivel]; // Nome do combustível
	public double valueFuel[] = new double[qtdCombustivel]; // Valor por litro
	public double qtd_liter[] = new double[qtdCombustivel]; // Quantidade de litros de 1 combustível escolhido

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public int getCcf() {
		return ccf;
	}
	
	public void setCcf(int ccf) {
		this.ccf = ccf;
	}
		
	public double getValueLiter() {
		return valueLiter;
	}

	public void setValueLiter(double valueLiter) {
		this.valueLiter = valueLiter;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getOdo() {
		return odo;
	}

	public void setOdo(int odo) {
		this.odo= odo;
	}

	public double getDst() {
		return dst;
	}

	public void setDst(double dst) {
		this.dst = dst;
	}

	public double getTotalLiters() {
		return totalLiters;
	}

	public void setTotalLiters(double totalLiters) {
		this.totalLiters = totalLiters;
	}

	public String getLevelReservoir() {
		return levelReservoir;
	}

	public void setLevelReservoir(String levelReservoir) {
		this.levelReservoir = levelReservoir;
	}

	public String getDateSupplies() {
		return dateSupplies;
	}

	public void setDateSupplies(String dateSupplies) {
		this.dateSupplies = dateSupplies;
	}
	
	public int getQtdCombustivel() {
		return qtdCombustivel;
	}
	
	public void setQtdCombustivel(int qtdCombustivel) {
		Fuel.qtdCombustivel = qtdCombustivel;
	}
	
	public int[] getVetorTypeFuel() {
		return vetorTypeFuel;
	}
	public void setVetorTypeFuel(int[] vetorTypeFuel) {
		this.vetorTypeFuel = vetorTypeFuel;
	}
	
	public String[] getTypeFuel() {
		return typeFuel;
	}
	
	public void setTypeFuel(String[] typeFuel) {
		this.typeFuel = typeFuel;
	}
	public double[] getValueFuel() {
		return valueFuel;
	}

	public void setValueFuel(double[] valueFuel) {
		this.valueFuel = valueFuel;
	}
	
	public double[] getQtd_liter() {
		return qtd_liter;
	}

	public void setQtd_liter(double[] qtd_liter) {
		this.qtd_liter = qtd_liter;
	}


}
