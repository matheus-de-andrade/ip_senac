package procedimentos_funcoes;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("-- Calculadora --\n\n(+)Adição\n(-)Subtração\n(*)Multiplicação\n(/)Divisão\n\nPrimeiro número: ");
		double num1 = teclado.nextDouble();
		System.out.print("Segundo número: ");
		double num2 = teclado.nextDouble();
		System.out.print("operação: ");
		String operador = teclado.next();
		System.out.print(num1 + " " + operador + " " + num2 + " = " );
		switch(operador) {
		case "+":{
			calcularAdicao(num1, num2);
			break;
		}
		case "-": {
			calcularSub(num1, num2);
			break;
		}
		case "*":{
			calcularMult(num1, num2);
			break;
		}
		case "/":{
			calcularDiv(num1, num2);
			break;
		}
		}
		teclado.close();
	}
	
	static void calcularAdicao(double num1, double num2) {
		System.out.print(num1 + num2);
	}
	
	static void calcularSub(double num1, double num2) {
		System.out.print(num1 - num2);
	}
	
	static void calcularMult(double num1, double num2) {
		System.out.print(num1 * num2);
	}
	
	static void calcularDiv(double num1, double num2) {
		System.out.print(num1 / num2);
	}

}
