package lesson003;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int telefonKod = 123;
		int mailKod = 456;

		System.out.println("Telefona gelen kodu giriniz : ");
		int kod1 = scanner.nextInt();
		System.out.println("Maile gelen kodu giriniz : ");
		int kod2 = scanner.nextInt();

		if (kod1 == 123 && kod2 == 456) {
			System.out.println("sisteme kayıt oldunuz");
		} else if (telefonKod == kod1 && mailKod != kod2) {
			System.out.println("mailinize gelen kodu tekrar giriniz");
		} else if (telefonKod != kod1 && mailKod == kod2) {
			System.out.println("telefona gelen kodu tekrar giriniz");
		}

		else {
			System.out.println("telefon ve mail kodunuz hatalıdır");
		}

	}

}
