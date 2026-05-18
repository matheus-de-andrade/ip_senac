package strings;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		System.out.print("Digite uma frase: ");
		String frase = tc.nextLine();
		System.out.println("Qual palavra deseja substituir?");
		String palavraMudada = tc.nextLine();
		System.out.println("Qual palavra será posta no lugar?");
		System.out.print(frase.replace(palavraMudada, tc.nextLine()));
		tc.close();
	}

}