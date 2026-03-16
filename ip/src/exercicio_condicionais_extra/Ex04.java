package exercicio_condicionais_extra;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite sua altura: ");
		double altura = teclado.nextDouble();
		System.out.print("Informe seu genero:\n\nDigite:\nM -> Masculino\nF -> Feminino");
		String genero = teclado.nextLine();
		genero = teclado.nextLine();
		double pesoIdeal = 0.0;
		switch (genero) {
			case "M": case "m": {
				pesoIdeal = (72.7 * altura) - 58;
				break;
			}
			case "F": case "f": {
				pesoIdeal = (62.1 * altura) - 44.7;
				break;
			}
			default :{
				System.out.print("Opção inválida, tente novamente...");
				break;
			}
		}
		System.out.print("Seu peso ideal é de " + pesoIdeal + "KG");
		teclado.close();
	}

}
