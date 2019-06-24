package br.com.personal.io;

import java.util.Scanner;

import br.com.personal.io.ManagerIo;

public class GenerateFile {
	public static int CONT;
	public static int TOTAL_CAMPOS = 8;
	public static String tipoStrCombustivel;
	public static int tipoCombustivel = 0;
	
	public static int vetorTypeFuel[] = new int[CONT];
	public static String typeFuel[] = new String[CONT];
	public static double valorTypeFuel[] = new double[CONT];

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
		
		// Estrutura para adicionar um ou mais tipo/valor de combustível
		int opcao = 0;
		do {
			System.out.println("Adicionar Combustível?");
			System.out.println("1. Sim\n"
					+ "2. Não\n");
			int valor = scan.nextInt();
			if(valor == 1) {
				tipoStrCombustivel = ManagerIo.verificaTipoCombustivel(valor);
				CONT++;
			}
		} while (opcao != 2);
		
		// ManagerIo.verificaTipoCombustivel(tipoCombustivel);
		
		// Encapsulamento de dados
		fuel.setDateSupplies(data);
		fuel.setCcf(ccf);
		fuel.setTypeFuel(tipoStrCombustivel);
		
		System.out.println("Data informada: " + fuel.getDateSupplies());
		System.out.println("CCF: " + fuel.getCcf());
		for (int i = 0; i < CONT; i++) {
			System.out.println("Combustível: " + typeFuel[i]);
			System.out.println("Valor: " + valorTypeFuel[i]);
		}
		
	}
}
