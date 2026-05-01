package exercicio_array_matriz_extra;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double mediaTempo = 0;
		double maiorTempo = 0;
		double menorTempo = 100000;
		double tempoProva = 0;
		for(int i = 1; i <= 10; i++) {
			System.out.print("\nTempo de prova do " + i + "º corredor: ");
			tempoProva = teclado.nextDouble();
			mediaTempo += tempoProva;
			if(tempoProva < menorTempo) {
				menorTempo = tempoProva;
			}
			if(tempoProva > maiorTempo) {
				maiorTempo = tempoProva;
			}
		}
		mediaTempo = mediaTempo/10;
		System.out.print("\n-- Informações --\n\nTempo médio dos atletas: " + mediaTempo + "\nMaior tempo gasto por atleta na prova: " + maiorTempo + "\nDiferença com a média: " + (mediaTempo - maiorTempo) + "\nMenor tempo gasto por atleta na prova: " + menorTempo + "\nDiferença com a média: " + (mediaTempo - menorTempo));
		teclado.close();
	}

}