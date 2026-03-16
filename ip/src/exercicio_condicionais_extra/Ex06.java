package exercicio_condicionais_extra;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int rating = 0;
		System.out.println("Vamos aos questionamentos\n\nResponda:\nS -> Sim\nN -> Não\n\n1- Você já trabalhou com a vítima?");
		String p1 = teclado.nextLine();
		switch (p1) {
		case "s": case "S": {
			rating = rating + 1;
			break;
		}
		}
		System.out.println("Você já telefonou para a vítima?");
		String p2 = teclado.nextLine();
		switch (p2) {
		case "s": case "S": {
			rating = rating + 1;
			break;
		}
		}
		System.out.println("Você mora próxima a vítima?");
		String p3 = teclado.nextLine();
		switch (p3) {
		case "s": case "S": {
			rating = rating + 1;
			break;
		}
		}
		System.out.println("Você devia dinheiro a vítima?");
		String p4 = teclado.nextLine();
		switch (p4) {
		case "s": case "S": {
			rating = rating + 1;
			break;
		}
		}
		System.out.println("Você esteve no local do crime?");
		String p5 = teclado.nextLine();
		switch (p5) {
		case "s": case "S": {
			rating = rating + 1;
			break;
		}
		}
		switch (rating) {
			case 0: case 1:{
				System.out.print("Você é inocente deste caso, obrigado pelas respostas.");
				break;
			}
			case 2:{
				System.out.print("Você se mantém na lista de suspeitas, aguarde para as próximas etapas.");
				break;
			}
			case 3: case 4:{
				System.out.print("Você foi declarado cumplice do assassinato, aguarde para os procedimentos cabiveis.");
				break;
			}
			case 5:{
				System.out.print("Você é o assassino deste caso, aguarde para os procedimentos cabiveis.");
				break;
			}
		}
		teclado.close();
	}

}
