package exercicio_condicionais_extra;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formata = new DecimalFormat("0.00");
		System.out.print("Vamos calcular seu IMC \n\nDigite sua altura: ");
		double altura = teclado.nextDouble();
		System.out.print("Digite seu peso: ");
		double peso = teclado.nextDouble();
		double imc = peso / (altura * altura);
		System.out.print("\n-- Tabela --\nPeso: " + peso + "kg\nAltura: " + altura + "m\nImc: " + formata.format(imc) + "\n");
		if (imc < 18.5) {
			System.out.print("Classificação: Abaixo do peso");
		}
		if (imc >= 18.5 && imc <= 24.9) {
			System.out.print("Classificação: normal");
		}
		if (imc >= 25 && imc <=29.9) {
			System.out.print("Classificação: Sobrepeso");
		}
		if (imc >= 30 && imc <= 34.9) {
			System.out.print("Classificação: Obesidade - grau 1");
		}
		if (imc >= 35 && imc <= 39.9) {
			System.out.print("Classificação: Obesidade - grau 2");
		}
		if (imc >= 40) {
			System.out.print("Classificação: Obesidade - grau 3");
		}
		teclado.close();
	}

}
