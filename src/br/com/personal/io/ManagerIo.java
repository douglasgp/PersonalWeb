package br.com.personal.io;

import java.util.Scanner;

public class ManagerIo {
	public static Scanner scan = new Scanner(System.in);
	public static String fuelStr = null;
	public static int VALOR = 6;
	public static int CONT = 0;
	public static String[] typeFuel = new String[VALOR];
	public static double valueFuel[]= new double[VALOR];
	
	public static String verificaTipoCombustivel(int valor) {
		if(valor == 1) {
			fuelStr = "Gasolina";
			System.out.println("Você escolheu: " + fuelStr);
		}else if(valor == 2) {
			fuelStr = "Gasolina Aditivada";
			System.out.println("Você escolheu: " + fuelStr);
		}else if(valor == 3) {
			fuelStr = "Etanol Comum";
			System.out.println("Você escolheu: " + fuelStr);
		}else if(valor == 4) {
			fuelStr = "Etanol Aditivado";
			System.out.println("Você escolheu: " + fuelStr);
		}else if(valor == 5) {
			fuelStr = "Diesel";
			System.out.println("Você escolheu: " + fuelStr);
		}else if(valor == 6) {
			fuelStr = "Outros";
			System.out.println("Você escolheu: " + fuelStr);
		}else {
			System.out.println("Opção inválida!");
			System.exit(0);
		}		
		return fuelStr;
	}
	
	public static double registraPrecoCombustivel() {
		System.out.println(" = = = = = " + fuelStr + " = = = = = ");
		System.out.println("Informe VALOR por litro: ");
		double valorComb = scan.nextDouble();
		return valorComb;
	}
	
	public static double registraLitroCombustivel() {
		System.out.println(" = = = = = " + fuelStr + " = = = = = ");
		System.out.println("Informe QUANTIDADE de litros:");
		double qtdLitros = scan.nextDouble();
		return qtdLitros;
	}
	
	public static double calculaValorTotal(double preco, double litro) {
		double total = preco * litro;
		return total;
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
