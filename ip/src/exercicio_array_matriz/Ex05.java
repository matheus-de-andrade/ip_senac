package exercicio_array_matriz;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double[] notas = new double[10];
		double somaNotas = 0;
		int alunosAcima = 0;
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite a nota do " + (i + 1) + "° aluno: ");
			notas[i] = teclado.nextDouble();
			somaNotas += notas[i];
		}
		double media = somaNotas / notas.length;
		System.out.print("\n");
		for(int i = 0; i < notas.length; i++) {
			if(notas[i] > media) {
				alunosAcima++;
			}
		}
		System.out.print("-- Informações --\n\nSoma das notas: " + somaNotas + "\nN° de alunos: " + notas.length + "\nMédia das notas: " + media + "\nAlunos acima da média: " + alunosAcima);
		teclado.close();
	}

}