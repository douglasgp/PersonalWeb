package br.com.personal.testes;

import java.util.Calendar;

import javax.swing.JOptionPane;

import br.com.personal.controle.FuelBean;
import br.com.personal.modelo.Fuel;

public class TestUpdateFuel {
	public static void main(String[] args) {
		
		String value = JOptionPane.showInputDialog("Enter the ID to change a record: ");
		Long idFuel = Long.parseLong(value.trim());
		
		Fuel fuel = new Fuel();
		fuel.setValueLiter(4.179);
		fuel.setAmount(20.0);
		fuel.setCurrentKm(37981);
		fuel.setKmTraveled(62.2);
		fuel.setTotalLiters(4.786);
		fuel.setLevelReservoir("");
		fuel.setDateSupplies(Calendar.getInstance());
		fuel.setId(idFuel);
		
		FuelBean fuelBean = new FuelBean();
		fuelBean.update(fuel);
		
		JOptionPane.showMessageDialog(null, "Registry changed successfully!");
	}

}
