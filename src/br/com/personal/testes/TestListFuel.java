package br.com.personal.testes;

import java.util.List;

import javax.swing.JOptionPane;

import br.com.personal.controle.FuelBean;
import br.com.personal.modelo.Fuel;

public class TestListFuel {
	public static void main(String[] args) {

		FuelBean fuelBean = new FuelBean();

		List<Fuel> fuels = fuelBean.getList();
		for (Fuel fuel : fuels) {
			JOptionPane.showMessageDialog(null,
					"= = = = List of Supplies = = = =\n" + "Value liter: R$ " + fuel.getValueLiter() + "\nAmount: R$ "
							+ fuel.getAmount() + "\nCurrent Km: " + fuel.getCurrentKm() + "\nKm Traveled: "
							+ fuel.getKmTraveled() + "\nTotal liters: " + fuel.getTotalLiters() + "\nLevel reservoir: "
							+ fuel.getLevelReservoir() + "\nDate supplies: " + fuel.getDateSupplies().getTime());
		}

	}

}
