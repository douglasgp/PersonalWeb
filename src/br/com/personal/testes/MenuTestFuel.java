package br.com.personal.testes;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.personal.controle.FuelBean;
import br.com.personal.modelo.Fuel;

public class MenuTestFuel {
	public static void main(String[] args) throws SQLException {
		
		String valor = JOptionPane.showInputDialog("= = = = Test Menu = = = =\n"
				+ "Enter the desired option:\n\n"
				+ "1 - Insert contact.\n"
				+ "2 - List existing contacts.\n"
				+ "3 - Change contact data.\n"
				+ "4 - Remove contact.\n"
				+ "5 - Test connectino to database.\n"
				+ "6 - Get out.\n");
		
		int option = Integer.parseInt(valor.trim());
		
		if(option == 1) {
			FuelBean fuelBean = new FuelBean();
			Fuel fuel = null;
			fuelBean.addFuel(fuel);
			//JOptionPane.showMessageDialog(null, "Option not yet CONFIGURED!");
		}else if(option == 2) {
			FuelBean fuelBean = new FuelBean();
			fuelBean.getList();
		}else if(option == 3) {
			JOptionPane.showMessageDialog(null, "Option not yet CONFIGURED!");
		}else if(option == 4) {
			JOptionPane.showMessageDialog(null, "Option not yet CONFIGURED!");
		}else if(option == 5) {
			TestConnection connection = new TestConnection();
			//connection.testConnection();
		}else if(option == 6) {
			JOptionPane.showMessageDialog(null, "Close application ...");
			System.exit(0);
		}
	}

}
