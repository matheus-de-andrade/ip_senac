package exercicio_condicionais;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int anoBase = 2025;
		System.out.print("Digite se nome completo: ");
		String nomeCompleto = teclado.nextLine();
		System.out.print("Digite seu ano de nascimento: ");
		int dataNascimento = teclado.nextInt();
		System.out.print("Digite o ano de ingresso na empresa: ");
		int dataIngresso = teclado.nextInt();
		int tempoDeVida = anoBase - dataNascimento;
		int tempoDeServiço = anoBase - dataIngresso;
		if (tempoDeVida >= 65) {
			System.out.print("--> Adapto a aposentadoria");
		}
		else if (tempoDeServiço >= 30) {
			System.out.print("--> Adapto a aposentadoria");
		}
		else if (tempoDeServiço >= 25 && tempoDeVida >= 60) {
			System.out.print("--> Adapto a aposentadoria");
		}
		else {
			System.out.print("--> Inapto a aposentadoria");
		}
		teclado.close();
	}

}
