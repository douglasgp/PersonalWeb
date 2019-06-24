package br.com.personal.io;

import java.util.Scanner;

public class ManagerIo {
	public static Scanner scan = new Scanner(System.in);
	public static int VALOR = 0;
	public static int CONT = 0;
	public static String[] typeFuel = new String[VALOR];
	public static int valorFuel[]= new int[VALOR];
	
	public static String verificaTipoCombustivel(int tipoComb) {
		System.out.println("Tipo combustível: ");
		System.out.println("1. Gasolina\n"
				+ "2. Gasolina Aditivada\n"
				+ "3. Etanol\n"
				+ "4. Etanol Aditivado\n"
				+ "5. Diesel\n"
				+ "6. Outros\n"
				+ "9. Sair");
		tipoComb = scan.nextInt();
		
		if(tipoComb == 1) {
			GenerateFile.typeFuel[CONT] = "Gasolina";
			System.out.println("Combustível: " + GenerateFile.typeFuel[CONT]+"\n"
					+ "Valor: ");
			GenerateFile.valorTypeFuel[CONT] = scan.nextDouble();
			CONT++;
		}else if(tipoComb == 2) {
			GenerateFile.typeFuel[CONT] = "Gasolina Aditivada";
			CONT++;
		}else if(tipoComb == 3) {
			GenerateFile.typeFuel[CONT] = "Etanol Comum";
			CONT++;
		}else if(tipoComb == 4) {
			GenerateFile.typeFuel[CONT] = "Etanol Aditivado";
			CONT++;
		}else if(tipoComb == 5) {
			GenerateFile.typeFuel[CONT] = "Diesel";
			CONT++;
		}else if(tipoComb == 6) {
			GenerateFile.typeFuel[CONT] = "Outros";
			CONT++;
		}else {
			System.out.println("Opção inválida!");
			System.exit(0);
		}
		return typeFuel[CONT];
	}
	
	public static void registraPrecoCombustivel() {
		
	}
	public void adicionaCombustivel() {
		
	}
	
	public static void escolheCombustivel() {
		
		
	}
}
