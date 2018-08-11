package br.com.personal.testes;

import javax.swing.JOptionPane;

import br.com.personal.controle.FuelBean;
import br.com.personal.modelo.Fuel;

public class TestRemoveFuel {
	public static void main(String[] args) {

		String value = JOptionPane.showInputDialog("Enter the ID of the record to be removed: ");
		Long idFuel = Long.parseLong(value.trim());

		String valueAnswer = JOptionPane
				.showInputDialog("Are you sure you want to remove record number " + idFuel + "\nSIM = 1" + "\nNÃO = 2");
		int answer = Integer.parseInt(valueAnswer);

		if (answer == 1) {
			Fuel fuel = new Fuel();
			fuel.setId(idFuel);

			FuelBean fuelBean = new FuelBean();
			fuelBean.remove(fuel);

			JOptionPane.showMessageDialog(null, "Registry successfully removed!");
		}else {
			JOptionPane.showMessageDialog(null,"Registry not removed!");
		}

	}

}
