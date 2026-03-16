package exercicio_condicionais_extra;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner teclado =  new Scanner(System.in);
		System.out.print("Informe seu sálario bruto: ");
		double salarioBruto = teclado.nextDouble();
		double salarioLiquido = salarioBruto * 0.90;
		if (salarioLiquido < 1000) {
			salarioLiquido = salarioLiquido * 0.95;
		}
		else if (salarioLiquido >= 1000 && salarioLiquido <= 3000) {
			salarioLiquido = salarioLiquido * 0.90;
		}
		else {
			salarioLiquido = salarioLiquido * 0.80;
		}
		System.out.print("\n\nSálario líquido: R$" + salarioLiquido);
		teclado.close();
	}

}
