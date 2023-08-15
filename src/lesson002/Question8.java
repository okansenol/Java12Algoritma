package lesson002;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// kenarları bilinen üçgen nasıl bir üçgen

		Scanner scanner = new Scanner(System.in);

		int kenar1;
		int kenar2;
		int kenar3;

		System.out.println("lutfen ilk degeri giriniz : ");
		kenar1 = scanner.nextInt();
		System.out.println("lutfen ikinci degeri giriniz : ");
		kenar2 = scanner.nextInt();
		System.out.println("lutfen ucuncu degeri giriniz : ");
		kenar3 = scanner.nextInt();

		if (kenar1 > 0 && kenar2 > 0 && kenar3 > 0) {
			if (kenar1 == kenar2 && kenar2 == kenar3) {
				System.out.println("eskenar ucgendir");

			} else if (kenar1 == kenar2 || kenar1 == kenar3 || kenar2 == kenar3) {
				System.out.println("ikizkenar ucgendir");

			} else {
				System.out.println("cesit kenardir");
			}

		}

	}

}
