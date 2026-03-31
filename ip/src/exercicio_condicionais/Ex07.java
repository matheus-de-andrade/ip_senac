package exercicio_condicionais;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formata = new DecimalFormat("0.00");
		System.out.print("Qual o tipo de combustivel escolhido?\n\nDigite A para Alcool\nDigite G para Gasolina\n\n");
		String combustivel = teclado.nextLine();
		switch (combustivel) {
			case "a": case "A" :{
				System.out.println("Quantos litros de álcool foram colocados?");
				double quantAlcool = teclado.nextDouble();
				double valorAlcool = 6.20;
				if (quantAlcool > 20) {
					valorAlcool = (valorAlcool / 100) * 95;
				}
				else {
					valorAlcool = (valorAlcool / 100) * 97;
				}
				System.out.print("O valor total de " + quantAlcool + "L de álcool ficou em R$" + formata.format(valorAlcool * quantAlcool));
				break;
			}
			case "g": case "G": {
				System.out.println("Quantos litros de gasolina foram colocados?");
				double quantGasolina = teclado.nextDouble();
				double valorGasolina = 6.90;
				if (quantGasolina > 20) {
					valorGasolina = (valorGasolina / 100) * 94;
				}
				else {
					valorGasolina = (valorGasolina / 100) * 96;
				}
				System.out.print("O valor total de " + quantGasolina + "L de gasolina ficou em R$" + formata.format(valorGasolina * quantGasolina));
				break;
			}
			default :{
				System.out.print("Opção inválida, tente novamente...");
				break;
			}
		}
		teclado.close();
	}
}