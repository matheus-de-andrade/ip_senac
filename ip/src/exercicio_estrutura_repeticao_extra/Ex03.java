package exercicio_estrutura_repeticao_extra;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i = 1;
		double dist = 0;
		double temp = 0;
		while(i <= 5) {
			System.out.println("Qual a distância em metros da " + i + "º corrida(das ultimas 5)?");
			dist += teclado.nextDouble();
			System.out.println("Qual o tempo para a conclusão da " + i + " corrida?(em minutos)");
			temp += teclado.nextDouble();
			i++;
		}
		double tempMedio = dist/temp;
		System.out.print("Qual a distância (em metros) da sua próxima corrida?");
		double distcorrida = teclado.nextDouble();
		System.out.print("Seu tempo da próxima prova deve ser em torno de " + distcorrida/tempMedio + " minutos");
		teclado.close();
	}

}
