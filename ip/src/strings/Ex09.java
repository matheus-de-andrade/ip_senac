package strings;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		System.out.print("Informe um verbo: ");
		String verbo = tc.next();
		String[] terminacao = {"o", "as", "a", "amos", "ais", "am"};
		String[] sujeito = {"Eu", "Tu", "Ele", "Nós", "Vós", "Eles"}; 
		verbo = verbo.replace("ar", "");
		for(int i = 0; i < terminacao.length; i++) {
			System.out.print(sujeito[i] + " " + verbo + terminacao[i] + "\n");
		}
		tc.close();
	}

}