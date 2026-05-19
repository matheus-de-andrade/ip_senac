package strings;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		System.out.print("Informe um número: ");
		String palavra = tc.next();
		char[] numsSep = new char[palavra.length()];
		numsSep = palavra.toCharArray();
		for(int i = 0; i <palavra.length(); i++) {
			switch(numsSep[i]) {
			case'0': {
				System.out.print("zero ");
				break;
			}
			case'1': {
				System.out.print("um ");
				break;
			}
			case'2': {
				System.out.print("dois ");
				break;
			}
			case'3': {
				System.out.print("três ");
				break;
			}
			case'4': {
				System.out.print("quatro ");
				break;
			}
			case'5': {
				System.out.print("cinco ");
				break;
			}
			case'6': {
				System.out.print("seis ");
				break;
			}
			
			case'7': {
				System.out.print("sete ");
				break;
			}
			case'8': {
				System.out.print("oito ");
				break;
			}
			case'9': {
				System.out.print("nove ");
				break;
			}
			}
		}
		tc.close();
	}
}