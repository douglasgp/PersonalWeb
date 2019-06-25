package br.com.personal.io;

import java.util.Scanner;

import br.com.personal.io.ManagerIo;

public class GenerateFile {
	public static int QTD_COMBUSTIVEL = 6;
	public static int CONT = 0;
	public static int TOTAL_CAMPOS = 8;
	public static String tipoStrCombustivel;
	public static int tipoCombustivel = 0;
	
	public static int vetorTypeFuel[] = new int[QTD_COMBUSTIVEL];
	public static String typeFuel[] = new String[QTD_COMBUSTIVEL];
	public static double valorTypeFuel[] = new double[QTD_COMBUSTIVEL];

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
			// Menu de opção para inserir informações de combustível
			System.out.println("Adicionar Combustível?");
			System.out.println("1. Sim\n"
					+ "2. Não\n");
			opcao = scan.nextInt();
			if(opcao == 1) {
				// Armazena numa posição do vetor, o código retornado pelo método
				vetorTypeFuel[CONT] = ManagerIo.escolheCombustivel(opcao);
				// Armazena numa posição do vetor nome do combustível retornado pelo método
				// Envio de parâmetro INT e retorno de parâmetro STRING
				typeFuel[CONT] = ManagerIo.verificaTipoCombustivel(vetorTypeFuel[CONT]);
				// contador soma +1 para ser utilizado pelo vetor caso usuário adicione mais combustível nesta seção
				CONT++;
			}
		} while (opcao != 2);
		/*
		for (int i = 0; i < vetorTypeFuel.length; i++) {
			typeFuel[i] = ManagerIo.verificaTipoCombustivel(vetorTypeFuel[i]);
			System.out.println("Combustível: " + typeFuel[i]);
		}*/
		
		// ManagerIo.verificaTipoCombustivel(tipoCombustivel);
		
		// Encapsulamento de dados
		fuel.setDateSupplies(data);
		fuel.setCcf(ccf);
		fuel.setTypeFuel(tipoStrCombustivel);
		
		System.out.println("Data informada: " + fuel.getDateSupplies());
		System.out.println("CCF: " + fuel.getCcf());
		for (int i = 0; i < CONT; i++) {
			System.out.println("Código: " + vetorTypeFuel[i]);
			System.out.println("Combustível: " + typeFuel[i]);
			// System.out.println("Valor: " + valorTypeFuel[i]);
		}
		
	}
}
