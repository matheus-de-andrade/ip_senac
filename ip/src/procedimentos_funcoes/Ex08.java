package procedimentos_funcoes;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double[] numsTri = new double[3];
		for(int i = 0; i < numsTri.length; i++) {
			System.out.print("Digite o " + (i+1) + "° número: ");
			numsTri[i] = teclado.nextDouble();
		}
		int verificacao = verificarTriangulo(numsTri);
		System.out.print("-- Informações --\n\n");
		if(verificacao == 1) {
			System.out.print("É triangulo!!\n");
			tipoTriangulo(numsTri);
		}
		else {
			System.out.print("Não é triangulo!!");
		}
		teclado.close();
	}
	
	static int verificarTriangulo(double[] numsTri) {
		double lado1 = numsTri[0];
		double lado2 = numsTri[1];
		double lado3 = numsTri[2];
		int validacao = 0;
		if(lado1 < (lado2 + lado3) || lado2 < (lado1 + lado3) || lado3 < (lado1 + lado2)) {
			validacao = 1;
		}	
		return validacao;
	}
	
	static void tipoTriangulo(double[] numsTri) {
		if((numsTri[1] == numsTri[0]) || (numsTri[0] == numsTri[2]) || (numsTri[1] == numsTri[2])) {
			System.out.print("Tipo d triangulo: isóceles");
		}
		if(numsTri[0] == numsTri[1] && numsTri[1] == numsTri[2]) {
			System.out.print("Tipo d triangulo: Equilátero");
		}
	}

}
