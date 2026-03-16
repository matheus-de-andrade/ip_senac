package exercicio_condicionais;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formata = new DecimalFormat("0.00");
		System.out.println("Olá, quantas maças você comprou?");
		int quantMaca = teclado.nextInt();
		if (quantMaca < 12) {
			System.out.println("O valor total ficou em R$" + formata.format(quantMaca * 1.30));
		}
		else {
			System.out.println("O valor total ficou em R$" + formata.format(quantMaca));
		}
		teclado.close();
	}

}
