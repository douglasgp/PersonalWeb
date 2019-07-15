package br.com.personal.testes;

import java.util.Scanner;

public class TestMethodReturn {
	public static Scanner scan = new Scanner(System.in);

	public static int NUM_SEMESTRE = 0;
	public static int TOTAL_DISCIPLINA = 0;

	public static int CARGA_HORARIA[] = new int[TOTAL_DISCIPLINA];
	public static String NAMES_HALF[] = new String[TOTAL_DISCIPLINA];
	public static int totalDisciplina = 0;
	public static String[] nomeDisciplina = new String[totalDisciplina];

	public static void main(String[] args) {

		System.out.println("Informe nº semestre: ");
		NUM_SEMESTRE = scan.nextInt();
		// Invoca método para retornar qtd de matérias do semestre informado
		TOTAL_DISCIPLINA = qtdDisciplina(NUM_SEMESTRE);
		// Invoca método para retornar vetor da carga horárias das disciplinas do
		// semestre informado
		int totalHoras[] = qtdHorasAulas(NUM_SEMESTRE);
		// Invoca método que retorna vetor com nomes das disciplinas do semestre
		// informado
		String nomesDisiciplinas[] = nomesDisciplinas(NUM_SEMESTRE);

		// Exibe total de disciplina e o semestre informado
		System.out.println("Semestre: " + NUM_SEMESTRE + "º:");
		System.out.println("Disciplinas: " + TOTAL_DISCIPLINA);
		for (int i = 0; i < totalHoras.length; i++) {
			System.out.println((i+1)+". "+nomesDisiciplinas[i] + " : " + totalHoras[i]);
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

	public static int[] qtdHorasAulas(int opcao) {
		int mHoraAula[] = new int[TOTAL_DISCIPLINA];
		if (opcao == 1) {
			int horasSem1[] = { 80, 80, 80, 80, 80, 80, 80, 40 };
			for (int i = 0; i < mHoraAula.length; i++) {
				mHoraAula[i] = horasSem1[i];
			}
		} else if (opcao == 2) {
			int vetorSem2[] = { 80, 80, 80, 40, 80, 80, 80, 40, 40 };
			for (int i = 0; i < mHoraAula.length; i++) {
				mHoraAula[i] = vetorSem2[i];
			}
		} else if (opcao == 3) {
			int vetorSem3[] = { 80, 80, 40, 80, 80, 80, 80, 40, 40 };
			for (int i = 0; i < mHoraAula.length; i++) {
				mHoraAula[i] = vetorSem3[i];
			}
		}
		return mHoraAula;
	}

	// Função para retornar vetor (String) com nomes das disciplinas do semestre
	// corrente
	public static String[] nomesDisciplinas(int opcao) {
		String disciplinas[] = new String[TOTAL_DISCIPLINA];
		if (opcao == 1) {
			String disciplinaSem1[] = { "ILM001", "ISI002", "IAL002", "IAC001", "AAG001", "MMD001", "LPO001","LIN100" };
			for (int i = 0; i < disciplinaSem1.length; i++) {
				disciplinas[i] = disciplinaSem1[i];
			}
		} else if (opcao == 2) {
			String disciplinaSem1[] = { "IES100", "ILP010", "ILP502", "IHW100", "ISO100", "MET100", "MCA002", "CCG006","LIN200" };
			for (int i = 0; i < disciplinaSem1.length; i++) {
				disciplinas[i] = disciplinaSem1[i];
			}
		}
		return disciplinas;
	}
}
