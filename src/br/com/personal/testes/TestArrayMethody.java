package br.com.personal.testes;

import java.util.Scanner;

import br.com.personal.io.Fuel;

public class TestArrayMethody {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int valueTotal = 3;
		int contador = 0;
		String combustivel;
		String typeFuel1 = null;
		Fuel fuel = new Fuel();

		System.out.println("Date: ");
		fuel.setDateSupplies(scan.nextLine());

		for (int i = 0; i < valueTotal; i++) {
			System.out.println("Tipo de combustível: ");
			typeFuel1 = scan.nextLine();			
			fuel.getTypeFuel()[i] = typeFuel1;
		}

		System.out.println("Data informada: " + fuel.getDateSupplies());
		System.out.println("= = = = Combustíveis = = = = ");
		for (int i = 0; i < valueTotal; i++) {
			System.out.println((i+1)+"- " +fuel.getTypeFuel()[i]);
		}
	}

}
