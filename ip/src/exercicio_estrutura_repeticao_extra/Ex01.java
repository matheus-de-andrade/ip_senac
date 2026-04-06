package exercicio_estrutura_repeticao_extra;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formata = new DecimalFormat("0.00");
		System.out.print("Quantos produtos foram comprados? ");
		int numProdutos = teclado.nextInt();
		int i = 1;
		double valorProduto = 0;
		while(i <= numProdutos) {
			System.out.print("Qual o preço do " + i + "º produto?");
			valorProduto += teclado.nextDouble();
			i++;
		} 
		System.out.print("\n--Informações gerais--\n\nTotal de produtos: " + numProdutos + "\nValor total de compra: R$" + formata.format(valorProduto) + "\nPreço médio por produto: R$" + formata.format(valorProduto/numProdutos));
		teclado.close();
	}

}
