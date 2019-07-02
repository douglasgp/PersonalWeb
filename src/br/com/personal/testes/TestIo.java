package br.com.personal.testes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;

import br.com.personal.io.Fuel;

public class TestIo {
	public static Scanner scan = new Scanner(System.in);
	public static String name = null;
	public static String path = null;
	
	static Fuel fuel = new Fuel();

	public static void criaArquivo(String name) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(name));
	}

	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		while (true) {
			if (linha != null) {
				System.out.println(linha);
			} else
				break;
			linha = buffRead.readLine();
		}
		buffRead.close();
	}

	public static void escritor(String path) throws IOException {
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String linha = "";
		System.out.println("Escreva algo");
		linha = scan.nextLine();

		buffWrite.append(linha + "\n");
		buffWrite.close();
	}

	public static String defineNome() {
		System.out.println("Informe o nome do arquivo: ");
		name = scan.nextLine();
		path = "/home/douglasgp/Public/Pedidos/" + name + ".txt";
		return path;
	}

	public static void conferePath() {
		if (path != "") {
			System.out.println("Path:\n" + path);
		} else {
			System.out.println("Path VAZIO!");
		}
	}

	public static void recFuel() throws IOException {
		String typeFuel[] = {"Gasolina", "Etanol", "Diesel"};
		// double valueFuel[] = {4.50, 2.90, 3.80};
		int tam = typeFuel.length;
		// 1.1. Declara variáveis com conteúdo
		String data = "14/06/2019";
		int ccf = 39308;
		// 2.1. Invoco classe modelo e repasso conteúdo para suas variáveis
		fuel.setDateSupplies(data);
		fuel.setCcf(ccf);
		// 3.1. Exibe dados de classe externa
		System.out.println("Data: " + fuel.getDateSupplies());
		System.out.println("CCF: " + fuel.getCcf());
		// 3.2. Exibe opção para o usuário
		System.out.println("Gravar em arquivo .txt?\n"
				+ "1. Sim\n"
				+ "2. Não\n");
		int opcao = scan.nextInt();
		// 4.1. Estrutura para gerir opções de gravação de arquivo
		if (opcao == 1) {
			// 4.1.1. Carrega arquivo com caminho absoluto para gravação
			FileWriter file = new FileWriter("/home/douglasgp/Public/TestFiles/"+fuel.getCcf()+".txt");
			// 4.1.2. Declara uma nova instância do método responsável por gravar conteúdo no arquivo
			PrintWriter recFile = new PrintWriter(file);
			// 4.1.3. Grava no arquivo declarando explicitamente conteúdo por conteúdo 
			recFile.print(tam);
			recFile.println(fuel.getDateSupplies());
			recFile.println(fuel.getCcf());
			recFile.println();			
			// Fecha arquivo
			file.close();
		}
		// 3.3. Exibe opções de leitura do arquivo
		System.out.println("Ler arquivo?\n"
				+ "1. Sim\n"
				+ "2. Não\n");
		opcao = scan.nextInt();
		// 4.2. Estrutura para gerir opções de leitura do arquivo
		if(opcao == 1) {
			// 4.2.1. Abrir arquivo para leitura informando caminho absoluto
			DataInputStream dis = new DataInputStream(new FileInputStream("/home/douglasgp/Public/TestFiles/"+fuel.getCcf()+".txt"));
			// 4.2.2. Armazena a leitura do tamanho em uma variável
			tam = dis.readInt();
			// 4.2.3. Exibe o tamanho
			System.out.println("Tamanho: " + tam);
			// 4.2.4. Instancia conteúdos para variáveis locais
			String date = dis.readLine();
			int cupom = dis.readInt();
			// 4.2.5. Exibe o conteúdo das variávies
			System.out.printf("%4.3s | %-20.8s\n", "DATA", "CCF");
			System.out.printf("%-20s | %04d\n", date, cupom);
			// 4.2.6. Fecha arquivo após leitura
			dis.close();
		}
				
	}
	
	public static void testMenu() {
		System.out.println();
	}
}
