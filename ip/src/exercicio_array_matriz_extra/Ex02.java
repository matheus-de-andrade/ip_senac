package exercicio_array_matriz_extra;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double[] areas = new double[10];
		double areatotal = 0;
		for(int i = 0; i < areas.length; i++) {
			System.out.print("Digite a área da " + (i + 1) + "º casa: ");
			areas[i] = teclado.nextDouble();
			areatotal += areas[i];
		}
		double media = areatotal/areas.length;
		int quantidadeMediaBaixa = 0;
		for(int i = 0; i < areas.length; i++) {
			if(areas[i] < media) {
				quantidadeMediaBaixa++;
			}
		}
		System.out.print("\n--Informações--\n\nQuantidade de casas: 10\nMédia da área total: " + media + "m\nCasas com área abaixo da média: " + quantidadeMediaBaixa);
		teclado.close();
	}

}
