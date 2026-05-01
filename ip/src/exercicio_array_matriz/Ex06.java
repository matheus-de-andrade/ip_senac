package exercicio_array_matriz;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formata = new DecimalFormat("0.00");
		double[] tempMeses = new double[12];
		double somaTemp = 0;
		double maiorNum = 0;
		double menorNum = 100000;
		for(int i = 0; i < 12; i++) {
			System.out.print("\nDigite a média de temperatura do mês " + (i + 1) + "/2025 :");
			tempMeses[i] = teclado.nextDouble();
			somaTemp += tempMeses[i];
			if(maiorNum <= tempMeses[i]) {
				maiorNum = tempMeses[i];
			}
			if(menorNum > tempMeses[i]) {
				menorNum = tempMeses[i];
			}
		}
		double media = somaTemp / tempMeses.length;
		int mesesAbaixo = 0;
		for(int i = 0; i < 10; i++) {
			if(tempMeses[i] < media) {
				mesesAbaixo++;
			}
		}
		System.out.print("-- Informações --\n\nMenor temperatura registrada: " + menorNum + "°\nMaior temperatura registrada: " + maiorNum + "°\nMédia registrada do periodo: " + formata.format(media) + "° \n Meses em que a temperatura ficou abaixo da média: " + mesesAbaixo + " meses");
		teclado.close();
	}
}