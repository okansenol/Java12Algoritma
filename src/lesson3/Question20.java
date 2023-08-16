package lesson3;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int sayı;

		System.out.println("sayı giriniz");
		sayı = scanner.nextInt();
		
		int toplam = 0;
		while (sayı!=0) {
			if (sayı % 2 != 0) {
				toplam = toplam + sayı;

			}
			sayı--;
		}
		System.out.println(toplam);
	}

}
