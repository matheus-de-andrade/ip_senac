package exercicio_condicionais;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual a quantidade minima que o produto deve ter em estoque?");
		int minimoProduto =teclado.nextInt();
		System.out.println("Qual a quantidade máxima que o produto deve ter em estoque?");
		int maximoProduto = teclado.nextInt();
		double mediaEstoque = (minimoProduto + maximoProduto) /2;
		System.out.println("Quantas unidades do produto possuem atualmente no estoque?");
		int quantEstoque = teclado.nextInt();
		if (mediaEstoque <= quantEstoque) {
			System.out.print("Ainda não é nescessario realizar a reposição do produto");
		}
		else {
			System.out.print("Será nescessario realizar a reposição do produto o quanto antes!");
		}
		teclado.close();
	}
}