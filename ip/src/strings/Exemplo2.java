package strings;

public class Exemplo2 {

	public static void main(String[] args) {
		String frase = "frase de teste frase";
		
		String frase2 = frase.replaceFirst("frase ", "");
		
		System.out.println(frase);
		System.out.print(frase2);

	}

}
