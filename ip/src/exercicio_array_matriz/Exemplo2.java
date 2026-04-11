package exercicio_array_matriz;

public class Exemplo2 {

	public static void main(String[] args) {
		int[][] numeros = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i = 0; numeros.length > i; i++) {
			for(int j = 0; j < numeros[i].length; j++) {
				System.out.print(numeros[i][j] + " ");
			}
			System.out.print("\n");
		}
		int diagonal = 0;
		for(int i = 0; numeros.length > i; i++) {
			for(int j = 0; j < numeros[i].length; j++) {
				if(i ==j) {
					diagonal += numeros[i][j];
				}
			}
	}

}}
