package exercicio_estrutura_repeticao;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formata = new DecimalFormat("0.0");
		int i = 1;
		double nota = 0;
		do {
			System.out.print("Digite a " + i + "° nota: ");
			nota = teclado.nextDouble() + nota;
			i++;
		}while (i <= 10);
		System.out.print("A média final das 10 notas é de " + formata.format(nota / 10));
		teclado.close();
	}

}
