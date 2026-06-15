package exercicio_array_matriz;

import java.util.Scanner;

public class Exemplo4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		char[][] jogo = new char[3][3];
		int colum;
		int lin;
		int jogador = 1;
		int jogada = 1;
		int ganhador = 0;
		System.out.print("-- Jogo da velha -- \n\n Regras: \n1-Para jogar será nescessario indicar a linha e coluna para realizar a jogada\n2-Caso a jogada seja realizada em um bloco que já contenha uma jogada realizada, será nescessario realizar a marcação novamente\n3-O jogo sempre começa pelo jogador X\n\n Cordenadas:\n[0,0] [0,1] [0,2]\n[1,0] [1,1] [1,2]\n[2,0] [2,1] [2,2]\n\n");
		do {
		//Vai mostrar ao usuário o jogo atualizado com as jogadas já feitas
		for(int i = 0; i < 3; i++) {
			System.out.print("\n");
			for(int j = 0; j < 3; j++) {
				System.out.print("[" + jogo[i][j] + "]");
				}}
			//Vai solicitar ao usuário a linha e coluna para lançar a jogada
			System.out.print("\nDigite a linha que deseja jogar: ");
			lin = teclado.nextInt();
			System.out.print("Digite a coluna que deseja jogar: ");
			colum = teclado.nextInt();
			//Aqui o código vai verficar se a posição jogada já não possui outra preenchida anteriormente, caso esteja, ele vai invalidar a jogada e pedir novamente
			if(jogo[lin][colum] == 'X') {
				System.out.print("Opção inválida, tente de novo ");
			}
			else if (jogo[lin][colum] == 'O') {
				System.out.print("Opção inválida, tente de novo ");
			}
			//Se a opção não estiver preenchida, vai adicionar a jogada desejada pelo usuario
			else {
			switch(jogador) {
			case 1: {
				jogo[lin][colum] = 'X';
				//Verificação de vencedor
				for(int i = 0; i < 3; i++) {
					if(jogo[i][0] == 'X' && jogo[i][1] == 'X' && jogo[i][2] == 'X') {
						for(int ix = 0; ix < 3; ix++) {
							System.out.print("\n");
							for(int j = 0; j < 3; j++) {
								System.out.print("[" + jogo[ix][j] + "]");
								}}
						System.out.print("\nO ganhador é o jogador 1 (X)");
						ganhador = 1;
					}
					if(jogo[0][i] == 'X' && jogo[1][i] == 'X' && jogo[2][i] == 'X') {
						for(int ix = 0; ix < 3; ix++) {
							System.out.print("\n");
							for(int j = 0; j < 3; j++) {
								System.out.print("[" + jogo[ix][j] + "]");
								}}
						System.out.print("\nO ganhador é o jogador 1 (X)");
						ganhador = 1;
					}
				}
				jogador = 2;
			break;
			}
			case 2: {
				jogo[lin][colum] = 'O';
				//Verificação de vencedor
				for(int j = 0; j < 3; j++) {
					if(jogo[0][j] == 'O' && jogo[1][j] == 'O' && jogo[2][j] == 'O') {
						for(int i = 0; i < 3; i++) {
							System.out.print("\n");
							for(int jx = 0; jx < 3; jx++) {
								System.out.print("[" + jogo[i][jx] + "]");
								}}
						System.out.print("\nO ganhador é o jogador 2 (O)");
						ganhador = 2;
					}
					if(jogo[j][0] == 'O' && jogo[j][1] == 'O' && jogo[j][2] == 'O') {
						for(int i = 0; i < 3; i++) {
							System.out.print("\n");
							for(int jx = 0; jx < 3; jx++) {
								System.out.print("[" + jogo[i][jx] + "]");
								}}
						System.out.print("\nO ganhador é o jogador 2 (O)");
						ganhador = 2;
					}
					if(jogo[j][j] == 'O' && jogo[j+1][j+1] == 'O' && jogo[j+2][j+2] == 'O') {
						for(int i = 0; i < 3; i++) {
							System.out.print("\n");
							for(int jx = 0; jx < 3; jx++) {
								System.out.print("[" + jogo[i][jx] + "]");
								}}
						System.out.print("\nO ganhador é o jogador 2 (O)");
						ganhador = 2;
					}
				}
				jogador = 1;
			break;
			}
			}
			jogada++;}
		} while(jogada <= 9 && ganhador != 1 && ganhador != 2);
			teclado.close();
		}
	}