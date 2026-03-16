package exercicio_condicionais_extra;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um número de 1 a 7: ");
		int diaSemana = teclado.nextInt();
		switch (diaSemana) {
			case 1 :{
				System.out.print("Domingo");
				break;
			}
			case 2 :{
				System.out.print("Segunda-feira");
				break;
			}
			case 3 :{
				System.out.print("Terça-feira");
				break;
			}
			case 4 :{
				System.out.print("Quarta-feira");
				break;
			}
			case 5 :{
				System.out.print("Quinta-feira");
				break;
			}
			case 6 :{
				System.out.print("Sexta-feira");
				break;
			}
			case 7 :{
				System.out.print("Sábado");
				break;
			}
			default :{
				System.out.print("Opção inválida, tente novamente...");
			}
		}
		teclado.close();
	}

}
