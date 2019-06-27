package br.com.personal.io;

import java.util.Scanner;

public class ManagerIo {
	public static Scanner scan = new Scanner(System.in);
	public static String fuelStr = null;
	public static int VALUE = 6;
	public static int CONT = 0;
	public static double TOTAL_VALUE = 0;
	
	public static String[] TYPE_FUEL = new String[VALUE];
	public static double VALUE_FUEL[] = new double[VALUE];
	
	public static double[] QTD_LITER = new double[VALUE];
	public static int VETOR_FUEL[] = new int[VALUE];

	// Método para retornar nome do combustível, baseado no cód retornado
	// do método anterior
	public static String verificaTipoCombustivel(int valor) {
		if (valor == 1) {
			fuelStr = "Gasolina";
			System.out.println("Você escolheu: " + fuelStr);
		} else if (valor == 2) {
			fuelStr = "Gasolina Aditivada";
			System.out.println("Você escolheu: " + fuelStr);
		} else if (valor == 3) {
			fuelStr = "Etanol Comum";
			System.out.println("Você escolheu: " + fuelStr);
		} else if (valor == 4) {
			fuelStr = "Etanol Aditivado";
			System.out.println("Você escolheu: " + fuelStr);
		} else if (valor == 5) {
			fuelStr = "Diesel";
			System.out.println("Você escolheu: " + fuelStr);
		} else if (valor == 6) {
			fuelStr = "Outros";
			System.out.println("Você escolheu: " + fuelStr);
		} else {
			System.out.println("Opção inválida!");
			System.exit(0);
		}
		return fuelStr;
	}

	// Método que solicita e retorna o preço/litro do combustível
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

	public static void finalizaRegistro() {

	}

	public static int escolheCombustivel(int valor) {
		// 2.1. Estrutura para adicionar um ou mais tipo/valor de combustível
		int opcao = 0;
		do {
			// 2.2. Menu de opção para inserir informações de combustível
			System.out.println("Adicionar Combustível?");
			System.out.println("1. Sim\n" + "2. Não\n");
			opcao = scan.nextInt();
			// 2.3. Estrutura para enviar e receber parâmetros/informações do combustível
			if (opcao == 1) {
				// 2.4. Armazena numa posição do vetor, o código retornado pelo método
				VETOR_FUEL[CONT] = escolheCombustivel(opcao);
				// 2.5 Armazena numa posição do vetor nome do combustível retornado pelo método
				// Envio de parâmetro INT e retorno de parâmetro STRING
				TYPE_FUEL[CONT] = verificaTipoCombustivel(VETOR_FUEL[CONT]);

				VALUE_FUEL[CONT] = registraPrecoCombustivel();

				QTD_LITER[CONT] = registraLitroCombustivel();

				TOTAL_VALUE = calculaValorTotal(VALUE_FUEL[CONT], QTD_LITER[CONT]);

				// 2.6 contador soma +1 para ser utilizado pelo vetor caso usuário adicione mais
				// combustível nesta seção
				CONT++;
			}
		} while (opcao != 2);

		// int valor = 0;
		System.out.println("Tipo combustível: ");
		System.out.println("1. Gasolina\n" + "2. Gasolina Aditivada\n" + "3. Etanol\n" + "4. Etanol Aditivado\n"
				+ "5. Diesel\n" + "6. Outros\n" + "9. Sair");
		valor = scan.nextInt();

		return valor;
	}

	public static void menuPrincipal() {
		int opcao = 0;
		do {
			// mostra menu de opões

			System.out.println(" = = = = = = = = = = = = = = = = = = = = =  MENU PRINCIPAL  = = = = = = = = = = = = = = = = = = = = = = = = = =  ");
			System.out.printf("%12.19s | %-12.15s | %-20.25s | %-17.20s | %-17.10s |%s\n", "1. Consultar  ","2. Registrar  ", "3. Consultar Carrinho", "4. Remover Produto", "5. Sair da ", "0. Finalizar");
			System.out.printf("%12.19s | %-12.15s | %-20.25s | %-17.18s | %-17.12s |%s\n", " abastecimento"," abastecimento", "   de Compras        ", "    do carrinho   ", "   aplicação", " Compra");
			System.out.println(" = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = ");

			opcao = scan.nextInt();
			// processa opção escolhida no menu
			switch (opcao) {
			case 1:
				break;
			case 2:
				break;
			case 3: //
				break;
			case 4: //
				break;
			case 5: //
				break;
			default:
				System.out.println("Operação Inválida!");
			}
		} while (opcao != 0); // repete enquanto opção diferente de sair
	}
}
