package exercicio_array_matriz_extra;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int maiorAndar = 0;
		for(int i = 1; i <= 10; i++) {
			System.out.print("Informe a quatidade de andares do " + i + "º prédio: ");
			if(teclado.nextInt() > 10) {
				maiorAndar++;
			}
		}
		System.out.print("\nA quatidade de prédios com mais de 10 andares é de " + maiorAndar);
		teclado.close();
	}

}