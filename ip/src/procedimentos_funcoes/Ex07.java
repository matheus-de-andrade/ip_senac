package procedimentos_funcoes;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe um número: ");
		int num = teclado.nextInt();
		boolean verificacao = calcularPrimo(num);
		if(verificacao == true) {
			System.out.print("\nO número " +  num + " é primo");
		}
		else {
			System.out.print("\nO número " + num + " não é primo");
		}

	}
	
	static boolean calcularPrimo(int num) {
		boolean validacao = false;
		int validador = 0;
		if(num > 10) {
			for(int i =1; i <= 10; i++) {
				if((num % i) == 0) {
					validador++;
				}
			}
			if(validador <= 1) {
				validacao = true;
			}
		}
		if(num <= 10) {
			for(int i =1; i <= 10; i++) {
				if((num % i) == 0) {
					validador++;
				}
			}
			if(validador == 2) {
				validacao = true;
			}
		}
		return validacao;
	}

}
