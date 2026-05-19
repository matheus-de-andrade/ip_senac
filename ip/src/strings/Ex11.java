package strings;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		System.out.print("Digite uma data: ");
		String data = tc.nextLine();
		String[] nums = data.split("/");
		switch(nums[1]) {
		case "01": case "1": {
			nums[1] = "janeiro";
			break;
		}
		case "02": case "2": {
			nums[1] = "Fevereiro";
			break;
		}
		case "03": case "3": {
			nums[1] = "Março";
			break;
		}
		case "04": case "4": {
			nums[1] = "Abril";
			break;
		}
		case "05": case "5": {
			nums[1] = "Maio";
			break;
		}
		case "06": case "6": {
			nums[1] = "Junho";
			break;
		}
		case "07": case "7": {
			nums[1] = "Julho";
			break;
		}
		case "08": case "8": {
			nums[1] = "Agosto";
			break;
		}
		case "09": case "9": {
			nums[1] = "Setembro";
			break;
		}
		case "10": {
			nums[1] = "Outubro";
			break;
		}case "11": {
			nums[1] = "Novembro";
			break;
		}
		case "12": {
			nums[1] = "Dezembro";
			break;
		}
		}
		System.out.print("\nVocê nasceu em " + nums[0] + " de " + nums[1] + " de " + nums[2]);
		tc.close();
	}

}
