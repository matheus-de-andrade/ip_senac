package exercicio_estrutura_repeticao;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i = 1;
		System.out.println("Quantas mercadorias a loja possui?");
		int quantMercadoria = teclado.nextInt();
		if(quantMercadoria != 0) {
			double valorMercadoria = 0;
			do {
				System.out.print("Informe o valor da " + i + "° mercadoria: ");
				valorMercadoria = teclado.nextDouble() + valorMercadoria;
				i++;
			}while (i <= quantMercadoria);
			System.out.print("\n-- Informativos --\n\nProdutos em estoque: " + quantMercadoria);
			System.out.print("\nValor total em estoque: R$" + valorMercadoria);
			System.out.print("\nValor médio do estoque: R$" + valorMercadoria / quantMercadoria);
		}
		else {
			System.out.print("Sua loja não possui produtos para calcular a média de valores ):");
		}
		teclado.close();
	}

}
