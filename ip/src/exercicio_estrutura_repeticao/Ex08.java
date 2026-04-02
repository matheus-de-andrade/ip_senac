package exercicio_estrutura_repeticao;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formata = new DecimalFormat("0.00");
		System.out.print("Gostaria de adicionar um produto ao estoque?\n\nS -> Sim\nN ->Não");
		String opcao = teclado.nextLine();
		int i = 0;
		double valorMercadoria = 0;
		switch(opcao) {
		case "s": case"S": {
			do {
				i++;
				System.out.print("Qual o valor desse produto?");
				valorMercadoria = teclado.nextDouble() + valorMercadoria;
				teclado.nextLine();
				System.out.print("Gostaria de adicionar mais algum produto?");
				opcao = teclado.nextLine();
			}while(opcao.equals("S") || opcao.equals("s"));
			System.out.print("\n-- Informações --\n\nItens em estoque: " + i + "\nValor em estoque: R$" + valorMercadoria);
			System.out.print("\nValor médio em estoque: R$" + formata.format(valorMercadoria/i));
			break;
		}
		case "n": case "N": {
			System.out.print("Você não tem produtos suficiente para calcular o valor médio de estoque ):");
			break;
		}
		default: {
			System.out.print("XXXXXXXXX Opção inválida XXXXXXXXX");
		}
		}
		teclado.close();
	}

}
