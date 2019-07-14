package br.com.personal.testes;

import java.util.Scanner;

public class TestMethodReturn {
	public static Scanner scan = new Scanner(System.in);
	public static int totalDisciplina = 0;

	public static void main(String[] args) {

		System.out.println("Informe nº semestre: ");
		int nSemestre = scan.nextInt();
		// Invoca método para retornar qtd de matérias do semestre informado
		int qtdDisciplina = qtdDisciplina(nSemestre);
		// Criar vetor
		//int qtdHorasDisicplinas[] = new int[totalDisciplina];
		// Invoca método para retornar vetor com qtd de horas das aulas
		int qtdHorasDisicplinas[] = qtdHorasAulas(nSemestre);
		
		// Exibe total de disciplina e o semestre informado
		System.out.println("Semestre: " + nSemestre + "º:");
		System.out.println("Disciplinas: " + qtdDisciplina);
		for (int i = 0; i < qtdHorasDisicplinas.length; i++) {
			System.out.println((i+1)+"º Disciplina: " + qtdHorasDisicplinas[i]);
		}
	}

	public static int qtdDisciplina(int opcao) {
		totalDisciplina = 0;
		if (opcao == 1) {
			totalDisciplina = 8;
		} else if (opcao == 2) {
			totalDisciplina = 9;
		} else if (opcao == 3) {
			totalDisciplina = 9;
		} else if (opcao == 4) {
			totalDisciplina = 8;
		} else if (opcao == 5) {
			totalDisciplina = 7;
		} else if (opcao == 6) {
			totalDisciplina = 6;
		} else {
			System.out.println("Opção inválida!");
			System.exit(0);
		}

		return totalDisciplina;
	}

	public static int[] qtdHorasAulas(int opcao) {;
		int mHoraAula[] = new int[totalDisciplina];
		if (opcao == 1) {
			// Inicializa variável com a qtd de aulas
			totalDisciplina = 7;
			int vetorSem1[] = { 80, 80, 80, 80, 80, 80, 80, 40 };
			for (int i = 0; i < mHoraAula.length; i++) {
				mHoraAula[i] = vetorSem1[i];
			}
		} else if (opcao == 2) {
			totalDisciplina= 8;
			int vetorSem2[] = { 80, 80, 80, 40, 80, 80, 80, 40, 40 };
			for (int i = 0; i < mHoraAula.length; i++) {
				mHoraAula[i] = vetorSem2[i];
			}
		} else if (opcao == 3) {
			totalDisciplina= 8;
			int vetorSem3[] = { 80, 80, 40, 80, 80, 80, 80, 40, 40 };
			for (int i = 0; i < mHoraAula.length; i++) {
				mHoraAula[i] = vetorSem3[i];
			}
		}
		return mHoraAula;
	}
}
