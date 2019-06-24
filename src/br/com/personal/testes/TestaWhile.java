package br.com.personal.testes;

import java.util.Scanner;

public class TestaWhile {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int valor = 0;
		int vetorInteiro[] = new int[valor];
		
		int opcao = 0;
		do {
			System.out.println("1. ");
			System.out.println("Informe o " +valor+"º valor: ");
			vetorInteiro[valor] = scan.nextInt();
			valor++;
		} while (opcao != 9);
		
		for (int i = 0; i < vetorInteiro.length; i++) {
			System.out.println(vetorInteiro[i]);
		}
	}

}
