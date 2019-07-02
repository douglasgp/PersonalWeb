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
			System.out.println("1. Definir nome do arquivo\n"
					+ "2. Ler arquivo\n"
					+ "3. Escrever no arquivo\n"
					+ "4. Conferir nome do path\n"
					+ "5. Registrar abastecimento\n"
					+ "9. Sair\n");
			opcao = scan.nextInt();
			switch (opcao) {
			case 1:
				path = TestIo.defineNome();
				break;
			case 2:
				TestIo.leitor(path);
				break;
			case 3:
				TestIo.escritor(path);
				break;
			case 4:
				TestIo.conferePath();
				break;
			case 5:
				TestIo.recFuel();
				break;
			case 6:
				TestIo.testMenu();
				break;
			default:
				break;
			}
		} while (opcao != 9);
		
	}
}
