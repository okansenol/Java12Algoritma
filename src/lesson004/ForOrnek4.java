package lesson004;

import java.util.Scanner;

public class ForOrnek4 {

	public static void main(String[] args) {
		// girilen sayının tam bölenlerinin toplamı=kendisi ise mükemmeldir yazsın

		Scanner scanner = new Scanner(System.in);
		int sayı;
		int bölen = 0;

		System.out.println("sayı giriniz: ");
		sayı = scanner.nextInt();

		for (int i = 1; i < sayı; i++) {
			if (sayı % i == 0) {
				bölen = bölen + i;

			}
		}
		if (bölen == sayı) {
			System.out.println("mükemmel sayıdır");
		} else {
			System.out.println("mükemmel sayı değildir");
		}

	}

}
