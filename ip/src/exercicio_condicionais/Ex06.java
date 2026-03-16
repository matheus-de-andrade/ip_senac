package exercicio_condicionais;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Vamos ao placar do jogo...\nInforme o time 1:");
		String time1 = teclado.nextLine();
		System.out.print("Quanos gols foram marcados pelo " + time1 + "?");
		int golsTime1 = teclado.nextInt();
		System.out.print("Informe o time 2: ");
		String time2 = teclado.nextLine();
		time2 = teclado.nextLine();
		System.out.print("Quanos gols foram marcados pelo " + time2 + "?");
		int golsTime2 = teclado.nextInt();
		System.out.print("\n\n--Placar Final--\n" + time1 + " " + golsTime1 + " X " + golsTime2 + " " + time2 + "\n\n");
		if (golsTime1 > golsTime2) {
			System.out.print("Resultado: " + time1 + " venceu!!");
		}
		if (golsTime1 < golsTime2) {
			System.out.print("Resultado: " + time2 + " venceu!!");
		}
		if (golsTime1 == golsTime2) {
			System.out.print("Resultado: empate");
		}
		teclado.close();
	}

}