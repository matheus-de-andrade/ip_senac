package exercicio_condicionais;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formata = new DecimalFormat("0.0");
		System.out.print("Calculo de média de aproveitamento:\n\nPrimeira nota: ");
		double nota1 = teclado.nextDouble();
		System.out.print("Segunda nota: ");
		double nota2 = teclado.nextDouble();
		System.out.print("Terceira nota: ");
		double nota3 = teclado.nextDouble();
		char conceito = 'n';
		double mediaExercicios = (nota1 + nota2 + nota3) / 3;
		double mediaAproveitamento = (nota1 + (nota2 * 2) + (nota3 * 3) + mediaExercicios) / 7;
		if (mediaAproveitamento >= 9) {
			conceito = 'A';
		}
		if (mediaAproveitamento < 9 && mediaAproveitamento >= 7.5) {
			conceito = 'B';
		}
		if (mediaAproveitamento < 7.5 && mediaAproveitamento >= 6.0) {
			conceito = 'C';
		}
		if (mediaAproveitamento < 6) {
			conceito = 'D';
		}
		System.out.print("--Média de aproveitamento--\nNota 1: " + nota1 + "\nNota 2: " + nota2 + "\nNota 3: " + nota3 + "\n\nMédia: " + formata.format(mediaAproveitamento) + "\nConceito Final: " + conceito);
		teclado.close();
	}

}
