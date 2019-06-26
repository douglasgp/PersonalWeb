package br.com.personal.testes;

import java.io.IOException;
import java.util.Scanner;

public class TestIoMain {
	public static Scanner scan = new Scanner(System.in);
	public static String path = null;
	public static void main(String[] args) throws IOException {
		String name;
		int opcao = 0;
		do {
			System.out.println("1. Criar arquivo\n"
					+ "2. Ler arquivo\n"
					+ "3. Escrever no arquivo\n"
					+ "9. Sair\n");
			switch (opcao) {
			case 1:
				System.out.println("Informe o nome do arquivo: ");
				name = scan.nextLine();
				path = "/home/douglasgp/Public/Pedidos/"+name+".txt";
				break;
			case 2:
				TestIo.escritor(path);
				break;
			case 3:
				TestIo.leitor(path);
				break;
			default:
				break;
			}
		} while (opcao != 9);
		
	}
}
