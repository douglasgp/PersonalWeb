package br.com.personal.io;

import java.util.Scanner;

import br.com.personal.io.ManagerIo;

public class GenerateFile {
	public static int QTD_COMBUSTIVEL = 6;
	public static int CONT = 0;
	public static int TOTAL_CAMPOS = 8;
	public static String tipoStrCombustivel;
	public static int tipoCombustivel = 0;
	public static double VALOR_TOTAL = 0;
	
	public static int vetorTypeFuel[] = new int[QTD_COMBUSTIVEL];
	public static String typeFuel[] = new String[QTD_COMBUSTIVEL];
	public static double valorTypeFuel[] = new double[QTD_COMBUSTIVEL];
	public static double QTD_LITRO[] = new double[QTD_COMBUSTIVEL];

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		Fuel fuel = new Fuel();
		ManagerIo opManager = new ManagerIo();
		

		// 1.1. Solicita DATA de abastecimento
		System.out.println("Data: ");
		String data = scan.nextLine();
		
		//1.2. Solicita CÓDIGO DE CUPOM FISCAL
		System.out.println("CCF: ");
		int ccf = scan.nextInt();
		
		//2.1. Estrutura para adicionar um ou mais tipo/valor de combustível
		int opcao = 0;
		do {
			//2.2. Menu de opção para inserir informações de combustível
			System.out.println("Adicionar Combustível?");
			System.out.println("1. Sim\n"
					+ "2. Não\n");
			opcao = scan.nextInt();
			// 2.3. Estrutura para enviar e receber parâmetros/informações do combustível
			if(opcao == 1) {
				//2.4. Armazena numa posição do vetor, o código retornado pelo método
				vetorTypeFuel[CONT] = ManagerIo.escolheCombustivel(opcao);
				//2.5 Armazena numa posição do vetor nome do combustível retornado pelo método
				// Envio de parâmetro INT e retorno de parâmetro STRING
				typeFuel[CONT] = ManagerIo.verificaTipoCombustivel(vetorTypeFuel[CONT]);
								
				valorTypeFuel[CONT] = ManagerIo.registraPrecoCombustivel();
				
				QTD_LITRO[CONT] = ManagerIo.registraLitroCombustivel();
				
				VALOR_TOTAL = ManagerIo.calculaValorTotal(valorTypeFuel[CONT], QTD_LITRO[CONT]);
				
				//2.6 contador soma +1 para ser utilizado pelo vetor caso usuário adicione mais combustível nesta seção
				CONT++;
			}
		} while (opcao != 2);
		/*
		for (int i = 0; i < vetorTypeFuel.length; i++) {
			typeFuel[i] = ManagerIo.verificaTipoCombustivel(vetorTypeFuel[i]);
			System.out.println("Combustível: " + typeFuel[i]);
		}*/
		
		//3.1. Encapsulamento de dados
		fuel.setDateSupplies(data);
		fuel.setCcf(ccf);
		fuel.setTypeFuel(tipoStrCombustivel);
		
		// 4.1. Exibe dados informados e gerados ao decorrer da sessão
		System.out.println("Data informada: " + fuel.getDateSupplies());
		System.out.println("CCF: " + fuel.getCcf());
		System.out.println("Valor total: R$ "+VALOR_TOTAL);
		for (int i = 0; i < CONT; i++) {
			System.out.println(" = = = = = " + typeFuel[i] + " = = = = = ");
			System.out.println("Código: " + vetorTypeFuel[i]);
			System.out.println("Preço/litro: R$ " + valorTypeFuel[i]);
			System.out.println("Qtd/litro: " + QTD_LITRO[i]);
			System.out.println();
		}
		
		// 
		ManagerIo.finalizaRegistro();
		
	}
}
