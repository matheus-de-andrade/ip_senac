package exercicio_estrutura_repeticao;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String opcao = teclado.nextLine();
		System.out.print("Gostaria de adicionar um produto ao estoque?\n\nS -> Sim\nN ->Não");
		opcao = teclado.nextLine();
		int i = 0;
		double valorMercadoria = 0;
		if (opcao == "S" || opcao == "s") {
		do {
			switch (opcao) {
			case "S": case "s": {
				i++;
				System.out.print("Digite o valor da " + i + "° mercadoria: ");
				valorMercadoria = teclado.nextDouble() + valorMercadoria;
				break;
			}
			case "N": case "n": {
				System.out.print("-- Informações --\n\nQuantidade de mercadoria: " + i);
				System.out.print("\nValor total em estoque: R$" + valorMercadoria);
				System.out.print("Média de valor em estoque: R$" + valorMercadoria / i);
				break;
		}
		}} while (opcao == "s" || opcao == "S");
		}
		else if(opcao == "n" || opcao =="N" ) {
			System.out.print("Seu estoque não possui mercadoria para obter informações ):");
		}
		else {
			System.out.print("Opção inválida, encerrando contagem");
		}
		teclado.close();
	}

}
