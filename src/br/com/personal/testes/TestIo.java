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
		double valueFuel[] = {4.50, 2.90, 3.80};  
		
		String data = "14/06/2019";
		int ccf = 39308;
		
		fuel.setDateSupplies(data);
		fuel.setCcf(ccf);
		
		System.out.println(fuel.getDateSupplies());
		System.out.println(fuel.getCcf());

		for (int i = 0; i < typeFuel.length; i++) {
			System.out.println(fuel.getTypeFuel()[i] = typeFuel[i]);
			System.out.println(fuel.getValueFuel()[i] = valueFuel[i]);
		}
		
		System.out.println("Gravar em arquivo .txt?\n"
				+ "1. Sim\n"
				+ "2. Não\n");
		int opcao = scan.nextInt();
		if (opcao == 1) {
			FileWriter file = new FileWriter("/home/douglasgp/Public/TestFiles/"+fuel.getCcf()+".db");
			PrintWriter recFile = new PrintWriter(file);
			
			recFile.write(fuel.getDateSupplies());
			recFile.write(fuel.getCcf());
			for (int i = 0; i < typeFuel.length; i++) {
				recFile.print(fuel.getTypeFuel()[i]);
				recFile.print(fuel.getValueFuel()[i]);
				// recFile.print("Combustível " + (i+1) + ": "+fuel.getTypeFuel()[i]+"\n");
			}
			recFile.println("");			
			file.close();
			
		}
		System.out.println("Ler arquivo?\n"
				+ "1. Sim\n"
				+ "2. Não\n");
		opcao = scan.nextInt();
		if(opcao == 1) {
			// Abrir arquivo para leitura
			DataInputStream dis = new DataInputStream(new FileInputStream("/home/douglasgp/Public/TestFiles/"+fuel.getCcf()+".db"));
			
			int tam = dis.readInt();
			System.out.println("Tamanho: " + tam);
			
		}
		
		
	}
	
	public static void testMenu() {
		System.out.println();
	}
}
