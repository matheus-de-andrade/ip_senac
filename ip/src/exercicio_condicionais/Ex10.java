package exercicio_condicionais;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formata = new DecimalFormat("0.00");
		System.out.print("Nome do produto: ");
		String nomeProduto = teclado.nextLine();
		System.out.print("Quantidade adquirida: ");
		int quantidade = teclado.nextInt();
		System.out.print("Valor unitário:");
		double valorUni = teclado.nextDouble();
		double valorTotal = quantidade * valorUni;
		double valor = valorTotal;
		if (quantidade <= 5) {
			valorTotal = valorTotal * 0.98;
		}
		if (quantidade > 5 && quantidade <= 10) {
			valorTotal = valorTotal * 0.97;
		}
		if (quantidade > 10) {
			valorTotal = valorTotal * 0.95;
		}
		System.out.print("\n--Nota fiscal--\nProduto: " + nomeProduto + "\nValor base: R$" + formata.format(valor) + "\nValor de deconto: R$" + formata.format(valor - valorTotal) + "\nTotal liquido: R$" + formata.format(valorTotal) );
		teclado.close();
	}

}
