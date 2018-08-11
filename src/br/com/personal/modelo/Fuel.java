package br.com.personal.modelo;

import java.util.Calendar;

// We work on mondays but today is not monday it is tuesday

public class Fuel {

	private Long id;

	private double valueLiter; // Valor por litro

	private double amount; // Valor total

	private int currentKm; // Km Atual

	private double kmTraveled; // Km Percorrido

	private double totalLiters; // Total de Litros

	private String levelReservoir; // Nível do reservatório

	private Calendar dateSupplies; // Data de abastecimento

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

	public int getCurrentKm() {
		return currentKm;
	}

	public void setCurrentKm(int currentKm) {
		this.currentKm = currentKm;
	}

	public double getKmTraveled() {
		return kmTraveled;
	}

	public void setKmTraveled(double kmTraveled) {
		this.kmTraveled = kmTraveled;
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

	public Calendar getDateSupplies() {
		return dateSupplies;
	}

	public void setDateSupplies(Calendar dateSupplies) {
		this.dateSupplies = dateSupplies;
	}

}
