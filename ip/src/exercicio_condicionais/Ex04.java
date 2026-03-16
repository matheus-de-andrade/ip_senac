package exercicio_condicionais;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formata = new DecimalFormat("0.00");
		System.out.print("Informe a quantidade de horas trabalhadas no mês: ");
		double horasMensais =  teclado.nextDouble();
		System.out.print("\nInforme o valor da hora trabalhada:");
		double valorHora = teclado.nextDouble();
		if (horasMensais <= 160) {
			System.out.print("\n--Holerite mensal--\n-----------------\nTotal de horas trabalhadas: " + horasMensais + "\nValor hora: R$" + valorHora + "\nHoras extras: 0\nEncargos por hora extra: "
					+ "R$0,00\n-----------------\nValor liquido mensal: R$" + formata.format(horasMensais * valorHora));
		}
		else {
			double horaTradicional = 160 * valorHora;
			double horaExtra = horasMensais - 160;
			double valorExtra = valorHora * 1.5;
			System.out.print("\n--Holerite mensal--\n-----------------\nTotal de horas trabalhadas: " + horasMensais + "\nValor hora: R$" + valorHora + "\nHoras extras: " + horaExtra + "\nEncargos por hora extra: R$"
					+ formata.format(horaExtra * valorExtra) + "\n-----------------\nValor liquido mensal: R$" + formata.format(horaTradicional + horaExtra * valorExtra));
		}
		teclado.close();
	}

}
