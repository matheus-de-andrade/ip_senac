package exercicio_condicionais;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int usuario = 12345;
		int senha = 54321;
		System.out.print("-- Login --\n\nUsuário: ");
		int entradaUsuario = teclado.nextInt();
		System.out.print("Senha: ");
		int entradaSenha = teclado.nextInt();
		if (usuario == entradaUsuario && senha == entradaSenha){
			System.out.print("\n-- ACESSO CONCEDIDO --");
		}
		else {
			System.out.print("\nXXXX ACESSO NEGADO XXXX\n -> Usuário ou senha incorretos");
		}
		teclado.close();
	}
}