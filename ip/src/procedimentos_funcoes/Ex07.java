package procedimentos_funcoes;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe um número: ");
		int num = teclado.nextInt();
		int verificacao = calcularPrimo(num);
		if(verificacao == 1) {
			System.out.print("\nO número " +  num + " é primo");
		}
		else {
			System.out.print("\nO número " + num + " não é primo");
		}

	}
	
	static int calcularPrimo(int num) {
		int validacao = 0;
		int validador = 0;
		if(num > 10) {
			for(int i =1; i <= 10; i++) {
				if((num % i) == 0) {
					validador++;
				}
			}
			if(validador <= 1) {
				validacao = 1;
			}
		}
		if(num <= 10) {
			for(int i =1; i <= 10; i++) {
				if((num % i) == 0) {
					validador++;
				}
			}
			if(validador == 2) {
				validacao = 1;
			}
		}
		return validacao;
	}

}
