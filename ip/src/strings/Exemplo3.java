package strings;

public class Exemplo3 {

	public static void main(String[] args) {
		String nome = "Matheus Andrade";
		String[] nomeDiv = nome.split(" ");
		System.out.print("-- Informações --\n\nNome padrão: " + nome + "\nNome maiusculas: " + nome.toUpperCase() + "\nNome em minusculas: " + nome.toLowerCase() + "\nQuantidade de caracteres: " + nome.replace(" ", "").length() + "\nPrimeiro nome: " + nomeDiv[0] + "\nUltimo nome: " + nomeDiv[nomeDiv.length - 1]);

	}

}
