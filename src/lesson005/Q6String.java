package lesson005;

import java.util.Iterator;
import java.util.Scanner;

public class Q6String {

	public static void main(String[] args) {
		// 1-harf saydırma
		// 0-çıkış
		Scanner scanner = new Scanner(System.in);

		boolean kontrol = true;
		while (kontrol) {
			System.out.println("====String işlemleri====");
			System.out.println("1- Harf Saydırma");

			System.out.println("0- Çıkış");

			int secim = scanner.nextInt();
			// scanner.nextLine();

			switch (secim) {
			case 1:
				int sayac = 0;
				String index = "";
				System.out.println("Kelime giriniz:");
				String kelime = scanner.next();

				System.out.println("Hangi harfi saymak istiyosunuz ");
				String harf = scanner.next();

				if (!kelime.contains(harf)) {
					System.out.println("Aradıgınız harf kelimede yoktur");
				} else {
					for (int i = 0; i < kelime.length(); i++) {
						if (kelime.charAt(i) == harf.charAt(0)) {
							sayac++;
							index += i + ",";
						}
					}
					// https://codeshare.io/bilge100
					System.out.println(harf + " harfi kelime içinde " + sayac + " adet bulunuyor");
					System.out.println(harf + " değerinin indexleri ==> " + index.substring(0, index.length() - 1));
				}
				break;

			default:
				break;
			}

		}

	}
}
