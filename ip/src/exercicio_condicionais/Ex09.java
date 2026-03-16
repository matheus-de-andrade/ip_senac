package exercicio_condicionais;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex09 {

	public static void main(String[] args) {
		DecimalFormat formata = new DecimalFormat("0.00");
		Scanner teclado = new Scanner(System.in);
		System.out.print("Quantos quilos de morangos foram comprados?");
		double quiloMorango =  teclado.nextDouble();
		double valorMorango = 2.50;
		System.out.print("Quantos quilos de maças foram comprados?");
		double quiloMaca = teclado.nextDouble();
		double valorMaca = 1.80;
		String desconto = "n";
		if (quiloMorango > 5) {
			valorMorango = 2.20;
		}
		if (quiloMaca > 5) {
			valorMaca = 1.50;
		}
		double valorTotal  = (quiloMorango * valorMorango) + (quiloMaca * valorMaca);
		if (valorTotal > 25 || (quiloMorango + quiloMaca) > 8) {
			valorTotal = valorTotal * 0.90;
			desconto = "s";
		}
		System.out.print("\n--Nota fiscal--\n" + quiloMorango + "KG de morango -> R$" + formata.format(quiloMorango * valorMorango) + "\n" + quiloMaca + "KG de maça -> R$" + formata.format(quiloMaca * valorMaca)
				+ "\n");
		if (desconto == "s") {
			System.out.print("Valor de desconto: 10%\n");
		}
		else {
			System.out.print("Valor de desconto: n/a\n");
		}
		System.out.print("\nSubTotal: R$" + formata.format(valorTotal));
		teclado.close();
	}

}
