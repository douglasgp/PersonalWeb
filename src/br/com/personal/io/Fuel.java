package br.com.personal.io;

import java.util.Calendar;

// We work on mondays but today is not monday it is tuesday

public class Fuel {

	private Long id;

	private double valueLiter; // Valor por litro

	private double amount; // Valor total

	private int odo; // Km Atual

	private double dst; // Km Percorrido

	private double totalLiters; // Total de Litros

	private String levelReservoir; // Nível do reservatório

	private String dateSupplies; // Data de abastecimento

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

}
