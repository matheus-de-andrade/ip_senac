package exercicio_condicionais;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Vamos calcular o tempo da partida de xadrez: \n\nDigite a hora de inicio: ");
		int horaInicio = teclado.nextInt();
		if (horaInicio > 24) {
			System.out.print("--Valor inválido--");
		}
		else {
			System.out.print("Digite a hora de término da partida: ");
			int horaFinal = teclado.nextInt();
			if (horaFinal > 24) {
			System.out.print("--Valor inválido--");
		}
			else {
				if (horaFinal > horaInicio) {
					int tempoPartida = horaFinal - horaInicio;
					System.out.print("Tempo de partida: " + tempoPartida + " horas");
		}
				else {
					int tempoPartida = horaFinal + (24 - horaInicio);
					System.out.print("Tempo de partida: " + tempoPartida + " horas");
		}
		}
		}
		teclado.close();
	}

}
