package outros;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		double[] notas = new double[4];
		double media = 0;
		for(int i = 0; i < notas.length; i++) {
			System.out.print("Digite a " + (i+1) + "° nota: ");
			notas[i] = tc.nextDouble();
			media += notas[i];
		}
		media/= notas.length;
		System.out.print("-- Informações --\n\nMédia: " + media + "\nNotas acima ou na média: ");
		for(int i = 0; i < notas.length; i++) {
			if(notas[i] >= media) {
				System.out.print(notas[i] + " ");
			}
		}
		System.out.print("\nNotas abaixo da média: ");
		for(int i = 0; i < notas.length; i++) {
			if(notas[i] < media) {
				System.out.print(notas[i] + " ");
			}
		}
		tc.close();
	}	
}
