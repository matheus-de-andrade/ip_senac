package exercicio_array_matriz_extra;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double[] alturasJog = new double[10];
		double media = 0;
		for(int i =0; i < alturasJog.length; i++) {
			System.out.print("Informe a altura do " + (i+1) + "º salto: ");
			alturasJog[i] = teclado.nextDouble();
			media += alturasJog[i];
		}
		media = media/alturasJog.length;
		System.out.print("-- Informações --\n\nAltura média de salto: " + media + "m\n\nSaltos com a altura abaixo da média:\n\n");
		for(int i = 0; i < alturasJog.length; i++) {
			if(alturasJog[i] < media) {
				System.out.print(alturasJog[i] + "m\n");
			}
		}
		teclado.close();
	}

}