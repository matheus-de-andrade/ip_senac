package strings;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		System.out.print("Digite uma frase: ");
		String frase = tc.nextLine();
		char[] letrasFrase = frase.toCharArray();
		int quantA = 0;
		int quantE = 0;
		int quantI = 0;
		int quantO = 0;
		int quantU = 0;
		for(int i = 0; i < letrasFrase.length; i++) {
			if(letrasFrase[i]=='a' || letrasFrase[i]=='A') {
				quantA++;
			}
			if(letrasFrase[i]=='e' || letrasFrase[i]=='E') {
				quantE++;
			}
			if(letrasFrase[i]=='i' || letrasFrase[i]=='I') {
				quantI++;
			}
			if(letrasFrase[i]=='o' || letrasFrase[i]=='O') {
				quantO++;
			}
			if(letrasFrase[i]=='u' || letrasFrase[i]=='U') {
				quantU++;
			}
		}
		System.out.print("--Informações--\n\nFrase: " + frase + "\n\nQuantidade de letras A: " + quantA + "\nQuantidade de letras E: " + quantE + "\nQuantidade de letras I: " + quantI + "\nQuantidade de letras O: " + quantO + "\nQuantidade de letras U: " + quantU);
		tc.close();
	}

}