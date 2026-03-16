package exercicio_condicionais;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formata = new DecimalFormat("0.0");
		System.out.print("Olá, vamos calcular sua média das avaliações. \n \nDigite a primeira nota:");
		double primeiraNota = teclado.nextDouble();
		System.out.print("Digite a segunda nota: ");
		double segundaNota = teclado.nextDouble();
		double media = (primeiraNota + segundaNota) / 2;
		if (media >= 7) {
			System.out.print("Parabéns!! Você foi aprovado, sua média final foi de " + formata.format(media));
		}
		else {
			System.out.print("\nInfelizmente você não foi aprovado, sua média de " + formata.format(media) + " não alcançou a nota minima para aprovação.");
		}
		teclado.close();
	}
}