package br.com.personal.testes;

import java.util.Scanner;

public class TesteVetorString {
	public static Scanner scan = new Scanner(System.in);
	public static int NUM_SEMESTRE = 0;
	public static int TOTAL_DISCIPLINA= 0;
	
	public static int CARGA_HORARIA[] = new int[TOTAL_DISCIPLINA];
	public static String NAMES_HALF[] = new String[TOTAL_DISCIPLINA];
	
	public static void main(String[] args) {
		// solicita número do semestre
		System.out.println("Informe um semestre (1 a 6): ");
		NUM_SEMESTRE = scan.nextInt();
		// Chama função com retorno de qtd de disciplinas
		TOTAL_DISCIPLINA = qtdDisciplinas(NUM_SEMESTRE);
		// Chama função com retorno de qtd horas/disciplina
		int totalHoras[] = qtdHoras(NUM_SEMESTRE);
		// Chama função com retorno dos nomes das disciplinas
		String nomesDisciplinas[] = nomesDisciplinas(NUM_SEMESTRE);
		// Exibe vetores em laço de repetição
		for (int i = 0; i < totalHoras.length; i++) {
			System.out.println(nomesDisciplinas[i] + ": "+ totalHoras[i]);
		}
	}
	// Função que retorna quantidade de disciplinas do semestre informado
	public static int qtdDisciplinas(int opcao) {
		int totalDisciplinas = 0;
		if(opcao == 1) {
			totalDisciplinas = 3;
		}else if(opcao == 2) {
			totalDisciplinas = 5;
		}else if(opcao == 3) {
			totalDisciplinas = 4;
		}
		System.out.println("Total de disciplinas: " + totalDisciplinas);
		return totalDisciplinas;
	}
	// Função que retorna vetor com nomes de disciplinas baseado no semestre informado
	public static String[] nomesDisciplinas(int opcao) {
		String disciplinas[] = new String[TOTAL_DISCIPLINA];
		if(opcao == 1) {
			String vetNomesDisciplina1[] = {"mat1","mat2","mat3"};
			for (int i = 0; i < vetNomesDisciplina1.length; i++) {
				disciplinas[i] = vetNomesDisciplina1[i];
			}
		}else if(opcao == 2) {
			String vetNomesDisciplina2[] = {"mat4","mat5","mat6","mat7","mat8"};
			for (int i = 0; i < vetNomesDisciplina2.length; i++) {
				disciplinas[i] = vetNomesDisciplina2[i];
			}
		}
		return disciplinas;
	}
	// Função que retorna carga horária das disciplinas do semestre informado
	public static int[] qtdHoras(int opcao) {
		int totalHoras[] = new int[TOTAL_DISCIPLINA];
		if(opcao == 1) {
			int vetHorasDisciplina1[] = {80, 40, 80};
			for (int i = 0; i < vetHorasDisciplina1.length; i++) {
				totalHoras[i] = vetHorasDisciplina1[i];
			}
		}else if(opcao == 2) {
			int vetHorasDisciplina2[] = {60, 40, 80, 80, 40};
			for (int i = 0; i < vetHorasDisciplina2.length; i++) {
				totalHoras[i] = vetHorasDisciplina2[i];
			}
		}
		return totalHoras;
	}	
}