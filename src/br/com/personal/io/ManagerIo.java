package br.com.personal.io;

import java.util.Scanner;

public class ManagerIo {
	public static Scanner scan = new Scanner(System.in);
	public static int VALOR = 6;
	public static int CONT = 0;
	public static String[] typeFuel = new String[VALOR];
	public static double valueFuel[]= new double[VALOR];
	
	public static String verificaTipoCombustivel(int valor) {
		String fuelStr = null;
		if(valor == 1) {
			fuelStr = "Gasolina";
			CONT++;
		}else if(valor == 2) {
			fuelStr = "Gasolina Aditivada";
			CONT++;
		}else if(valor == 3) {
			fuelStr = "Etanol Comum";
			CONT++;
		}else if(valor == 4) {
			fuelStr = "Etanol Aditivado";
			CONT++;
		}else if(valor == 5) {
			fuelStr = "Diesel";
			CONT++;
		}else if(valor == 6) {
			fuelStr = "Outros";
			CONT++;
		}else {
			System.out.println("Opção inválida!");
			System.exit(0);
		}
		return fuelStr;
	}
	
	public static void registraPrecoCombustivel() {
		
	}
	public void adicionaCombustivel() {
		
	}
	
	public static int escolheCombustivel(int valor) {
		// int valor = 0;
		System.out.println("Tipo combustível: ");
		System.out.println("1. Gasolina\n"
				+ "2. Gasolina Aditivada\n"
				+ "3. Etanol\n"
				+ "4. Etanol Aditivado\n"
				+ "5. Diesel\n"
				+ "6. Outros\n"
				+ "9. Sair");
		valor = scan.nextInt();
		
		return valor;
	}
}
