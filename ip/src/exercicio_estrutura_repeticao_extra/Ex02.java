package exercicio_estrutura_repeticao_extra;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i = 0;
		int idade = 0;
		double altura = 3.5;
		double alturaMenor;
		do {
			i++;
			System.out.print("Digite a idade do " + i + "º jogador: ");
			idade += teclado.nextInt();
			System.out.print("Digite a altura do " + i + "º jogador");
			alturaMenor = teclado.nextDouble();
			if(alturaMenor < altura) {
				altura = alturaMenor;
			}
		}while(i < 5);
		System.out.print("-- Infos --\n\nNúmero de jogadores: " + i + "\nMédia de idades: " + idade/i + "anos\nAltura do menor jogador: " + altura + "m\n");
		teclado.close();
	} 

}
