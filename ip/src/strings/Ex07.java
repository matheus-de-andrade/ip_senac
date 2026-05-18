package strings;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		System.out.print("Digite uma palavra: ");
		String palavra = tc.next();
		for(int i = 0; i <= palavra.length(); i++) {
			if(i < palavra.length()) {
				char[] palavra2 = new char[palavra.length()];
				palavra.getChars(0, i+1, palavra2, 0);
				System.out.println(palavra2);
			}
			if(i == palavra.length()) {
				for(int j = palavra.length()-1; j >0; j-- ) {
					char[] palavra2 = new char[palavra.length()];
					palavra.getChars(0, j, palavra2, 0);
					System.out.println(palavra2);
				}
			}
		}
		tc.close();
	}

}