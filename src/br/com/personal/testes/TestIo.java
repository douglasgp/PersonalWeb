package br.com.personal.testes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestIo {
	public static Scanner scan = new Scanner(System.in);
	public static String name = null;
	public static String path = null;
	
	public static void criaArquivo(String name) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(name));
	}
	
	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		while (true) {
			if(linha != null) {
				System.out.println(linha);
			}else
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
		path = "/home/douglasgp/Public/Pedidos/"+name+".txt";
		return path;
	}
	
	public static void conferePath() {
		if(path != "" ) {
			System.out.println("Path:\n"+path);
		}else {
			System.out.println("Path VAZIO!");
		}
	}
}
