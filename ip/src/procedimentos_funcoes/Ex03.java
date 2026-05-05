package procedimentos_funcoes;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double[] notas = new double[3];
		for(int i = 0; i < notas.length; i++) {
			System.out.print("Informe a " + (i + 1) + "° nota: ");
			notas[i] = teclado.nextDouble();
		}
		System.out.print("\nQual operação você deseja realizar com as notas?\n\n1 - Média aritmética\n2 - Média ponderada");
		int opcao = teclado.nextInt();
		switch(opcao) {
		case 1:{
			mediaAritmetica(notas);
			break;
		}
		case 2:{
			mediaPonderada(notas);
			break;
		}
		default:{
			System.out.print("Opção inválida, tente novamente...");
			break;
		}
		}
		teclado.close();
	}
	
	static void mediaAritmetica(double[] notas) {
		double valormedia = (notas[0] + notas[1] + notas[2]) / 3;
		System.out.print("A média aritmética é: " + valormedia);
	}
	
	static void mediaPonderada(double[] notas) {
		double valormedia = ((notas[0] *5) + (notas[1] *3) + (notas[2] * 2)) / 10;
		System.out.print("A média ponderada é: " + valormedia);

	}

}
