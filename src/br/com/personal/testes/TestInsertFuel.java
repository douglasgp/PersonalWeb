package br.com.personal.testes;

import java.sql.SQLException;
import java.util.Calendar;

import javax.swing.JOptionPane;

import br.com.personal.controle.FuelBean;
import br.com.personal.modelo.Fuel;

public class TestInsertFuel {
	public static void main(String[] args) throws SQLException {

		Fuel fuel = new Fuel();
		fuel.setValueLiter(2.679);
		fuel.setAmount(20.00);
		fuel.setCurrentKm(36659);
		fuel.setKmTraveled(275.6);
		fuel.setTotalLiters(7.465);
		fuel.setLevelReservoir("1-6");
		fuel.setDateSupplies(Calendar.getInstance());

		FuelBean fuelBean = new FuelBean();
		fuelBean.addFuel(fuel);

		JOptionPane.showMessageDialog(null, "Supplies registered Successfully!");

	}

}
