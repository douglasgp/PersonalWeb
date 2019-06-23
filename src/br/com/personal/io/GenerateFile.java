package br.com.personal.io;

import java.util.Scanner;

import br.com.personal.io.ManagerIo;

public class GenerateFile {
	public static int TOTAL_CAMPOS = 8;
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		Fuel fuel = new Fuel();
		ManagerIo opManager = new ManagerIo();
		
		// Solicita data de abastecimento
		System.out.println("Data: ");
		String data = scan.nextLine();
		// Encapsulamento de POO
		fuel.setDateSupplies(data);
		
		System.out.println("Data informada: " + fuel.getDateSupplies());

	}
}
