package procedimentos_funcoes;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe a pontuação do aluno: ");
		double pontuacao = teclado.nextDouble();
		System.out.print("\n");
		calcularponto(pontuacao);
		teclado.close();
	}
	
	static void calcularponto(double pontuacao) {
		if(pontuacao <= 60) {
			System.out.print("Classificação de conceito: Insatisfatório");
		}
		if(pontuacao >= 61 && pontuacao <= 75) {
			System.out.print("Classificação de conceito: Satisfatório");
		}
		if(pontuacao >= 76 && pontuacao <= 90) {
			System.out.print("Classificação de conceito: Bom");
		}
		if(pontuacao > 90) {
			System.out.print("Classificação de conceito: Ótimo");
		}
	}

}
