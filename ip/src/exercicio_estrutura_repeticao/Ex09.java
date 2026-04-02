package exercicio_estrutura_repeticao;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Quantos números serão lidos? ");
		int num = teclado.nextInt();
		int i = 0;
		int numMaior = 0;
		int numMenor = 0;
		int numDig;
		int numAnt = 100000000;
		int numTotal = 0;
		do {
			i++;
			System.out.print("Digite o " + i +"º número: ");
			numDig = teclado.nextInt();
			numTotal = numTotal + numDig;
			if (numDig > numMaior) {
				numMaior = numDig;
			}
			if (numDig < numAnt) {
				numMenor = numDig;
			}
			numAnt = numDig;
		}while(i < num);
		System.out.print("-- Informações --\n\nTotal de números: " + i + "\nSoma total dos números: "  + numTotal + "\nMédia dos valores: " + numTotal/i + "\nMenor número: " + numMenor + "\nMaior número: " + numMaior);
		teclado.close();
	}

}
