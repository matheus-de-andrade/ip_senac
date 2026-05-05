package procedimentos_funcoes;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a idade do nadador: ");
		int idade = teclado.nextInt();
		System.out.print("\n");
		calcularCategoria(idade);
		teclado.close();
	}
	
	static void calcularCategoria(int idade) {
		if(idade <= 10) {
			System.out.print("A categoria do jogador é: Mirim");
		}
		if(idade > 10 && idade < 15) {
			System.out.print("A categoria do jogador é: Infantil");
		}
		if(idade > 14 && idade < 20) {
			System.out.print("A categoria do jogador é: Juvenil");
		}
		if(idade > 19) {
			System.out.print("A categoria do jogador é: Adulto");
		}
	}

}
