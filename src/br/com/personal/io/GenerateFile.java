package br.com.personal.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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

	public static void main(String[] args) throws IOException{

		Fuel fuel = new Fuel();
		ManagerIo opManager = new ManagerIo();

		// ManagerIo.menuPrincipal();

		// 1.1. Solicita DATA de abastecimento
		System.out.println("Data: ");
		String data = scan.nextLine();

		// 1.2. Solicita CÓDIGO DE CUPOM FISCAL
		System.out.println("CCF: ");
		int ccf = scan.nextInt();

		// Teste para alimentar variável get/set da classe FUEL
		// 2.1. Estrutura para adicionar um ou mais tipo/valor de combustível
		int valor = 0;
		int opcao = 0;
		do {
			// 2.2. Menu de opção para inserir informações de combustível
			System.out.println("Adicionar Combustível?");
			System.out.println("1. Sim\n" + "2. Não\n");
			opcao = scan.nextInt();
			// 2.3. Estrutura para enviar e receber parâmetros/informações do combustível
			if (opcao == 1) {
				// int valor = 0;
				System.out.println("Tipo combustível: ");
				System.out.println("1. Gasolina\n" + "2. Gasolina Aditivada\n" + "3. Etanol\n" + "4. Etanol Aditivado\n"
						+ "5. Diesel\n" + "6. Outros\n" + "9. Sair");
				// Armazena em uma variável inteira a opção escolhida
				tipoCombustivel = scan.nextInt();
				
				// 2.3.1. Armazena a opção escolhida em array localizado em outra classe atraves do get
				fuel.getVetorTypeFuel()[CONT] = tipoCombustivel;
				
				// Envia a opção escolhida (int) e recebe pelo método uma String
				tipoStrCombustivel = ManagerIo.verificaTipoCombustivel(tipoCombustivel);
				
				// A variável da classe modelo é chamada para receber a String retornada do método anterior
				// 2.4. Armazena numa posição do vetor, o código retornado pelo método
				
				// 2.5. Armazena numa posição do vetor nome do combustível retornado pelo método
				// Envio de parâmetro INT e retorno de parâmetro STRING
				fuel.getTypeFuel()[CONT] = tipoStrCombustivel;
				
				// Exibe a String retornada em uma posição do vetor
				System.out.println(fuel.getVetorTypeFuel()[CONT]);
				
				// 2.5.1. Armazena numa posição do vetor PREÇO do combustível retornado pelo método
				valorTypeFuel[CONT] = ManagerIo.registraPrecoCombustivel();
				
				// 2.5.2. Repassa o valor armazenado numa posição do vetor para uma variável de outra classe
				fuel.getValueFuel()[CONT] = valorTypeFuel[CONT];
				
				// Exibe o valor armazenado nesta variável
				System.out.println("Valor: R$ " + fuel.getValueFuel()[CONT]);
				
				// 2.5.3. Armazena numa posição do vetor a qtd de litros de combustível
				QTD_LITRO[CONT] = ManagerIo.registraLitroCombustivel();
				
				// 2.5.4. Repassa valor armazenado numa posição do vetor para uma variável de outra classe
				fuel.getQtd_liter()[CONT] = QTD_LITRO[CONT];
				
				// Exibe total de litros do combustível escolhido
				System.out.println("Litros: " + fuel.getQtd_liter()[CONT]);
				
				// 2.5.5. Armazena o valor total, calculado pelo retorno do método
				// Soma e acumula valor total
				VALOR_TOTAL += ManagerIo.calculaValorTotal(valorTypeFuel[CONT], QTD_LITRO[CONT]);
							
				// 2.5.6. Repassa valor total para variável localizada em outra classe através do uso de get
				fuel.setAmount(VALOR_TOTAL);
				
				// 2.6 contador soma +1 para ser utilizado pelo vetor caso usuário adicione mais
				// combustível nesta seção
				CONT++;
			}
		} while (opcao != 2);
		
		// 2.4. Informar dados de quilometragem
		System.out.println("Iforme o ODO: ");
		int odo = scan.nextInt();
		
		System.out.println("Informe o DST: ");
		double dst = scan.nextDouble();
		
		// 3.1. Encapsulamento de dados
		fuel.setDateSupplies(data);
		fuel.setCcf(ccf);
		fuel.setOdo(odo);
		fuel.setDst(dst);

		// 4.1. Exibe dados informados e gerados ao decorrer da sessão
		System.out.println("Data informada: " + fuel.getDateSupplies());
		System.out.println("CCF: " + fuel.getCcf());
		
		// 5.1. Estrutura para exibir conteúdo das variáveis
		for (int i = 0; i < CONT; i++) {
			System.out.println(" = = = = = " + fuel.getTypeFuel()[i] + " = = = = = ");
			System.out.println("Código: " + fuel.getVetorTypeFuel()[i]);
			System.out.println("Preço/litro: R$ " + fuel.getValueFuel()[i]);
			System.out.println("Qtd/litro: " + fuel.getQtd_liter()[i]);
			System.out.println();
		}
		System.out.println("Valor total: R$ " + fuel.getAmount());
		
		System.out.println("Registrar abastecimento em arquivo .txt ?\n"
				+ "1. Sim\n"
				+ "2. Não\n");
		int opcao3 = scan.nextInt();
		
		if(opcao3 == 1) {
			FileWriter file1 = new FileWriter("/home/douglasgp/Public/TestFiles/" + fuel.getCcf() + ".txt");
			PrintWriter recFile1 = new PrintWriter(file1);
			PrintWriter recFile2 = new PrintWriter(file1);
			
			recFile1.println("Qtd combustivel: " + CONT);
			recFile1.println("Data: " + fuel.getDateSupplies());
			recFile1.println("CCF: " + fuel.getCcf());
			recFile1.println("ODO: " + fuel.getOdo());
			recFile1.println("DST: " + fuel.getDst());
			for(int i = 0; i < CONT; i++) {
				recFile1.print("");
				recFile1.println(" = = = = " + fuel.getTypeFuel()[i] + " = = = = ");
				recFile1.println("Código: " + fuel.getVetorTypeFuel()[i]);
				recFile1.println("Preço/litro: " + fuel.getValueFuel()[i]);
				recFile1.println("Qtd/litro: R$" + fuel.getQtd_liter()[i]);
			}
			recFile1.println("");
			
			recFile2.printf("%12.19s | %-12.15s |");
			file1.close();
		}

		// managerIo.finalizaRegistro();

	}
}
