package br.com.personal.io;

import java.util.Scanner;

import br.com.personal.io.ManagerIo;

public class GenerateFile {
	public static int CONT = 0;
	public static int TOTAL_CAMPOS = 8;
	public static String tipoStrCombustivel;
	public static int tipoCombustivel = 0;
	private static String typeFuel[] = new String[tipoCombustivel];

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		Fuel fuel = new Fuel();
		ManagerIo opManager = new ManagerIo();
		

		// Solicita DATA de abastecimento
		System.out.println("Data: ");
		String data = scan.nextLine();
		
		// Solicita CÓDIGO DE CUPOM FISCAL
		System.out.println("CCF: ");
		int ccf = scan.nextInt();
		
		// Solicita mais um tipo de combustível, se houver
		// Solicita TIPO de combustível
		int valor = 0;
		do {
			System.out.println("Tipo combustível: ");
			System.out.println("1. Gasolina\n"
					+ "2. Gasolina Aditivada\n"
					+ "3. Etanol\n"
					+ "4. Etanol Aditivado\n"
					+ "5. Diesel\n"
					+ "6. Outros\n"
					+ "0. Sair");
			CONT= scan.nextInt();
			
			// Invoca método de verificação para o tipo de combustível retornando uma String
			// tipoStrCombustivel = opManager.verificaTipoCombustivel(tipoCombustivel);
			typeFuel[CONT] = opManager.verificaTipoCombustivel(CONT);
			
			// tipoCombustivel = scan.nextInt();
			CONT++;
		} while (valor != 0);
		ManagerIo.verificaTipoCombustivel(tipoCombustivel);
		
		// Encapsulamento de dados
		fuel.setDateSupplies(data);
		fuel.setCcf(ccf);
		fuel.setTypeFuel(tipoStrCombustivel);
		
		System.out.println("Data informada: " + fuel.getDateSupplies());
		System.out.println("CCF: " + fuel.getCcf());
		for (int i = 0; i < CONT; i++) {
			System.out.println("Tipo combustível: " + tipoStrCombustivel);
			
		}
		
	}
}
