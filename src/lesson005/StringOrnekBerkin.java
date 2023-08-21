package lesson005;

import java.util.Scanner;

public class StringOrnekBerkin {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean kontrol = true;
		while (kontrol) {
			System.out.println("=====String İşemleri=====");
			System.out.println("1-Harf Saydırma");

			System.out.println("0-çıkış");
			int secim = scanner.nextInt();
			scanner.nextLine();

			switch (secim) {
			case 1:
				// ahmetm
				// m
				int sayac = 0;
				String indexler = "";
				System.out.println("Lütfen bir kelime giriniz: ");
				String kelime = scanner.nextLine();
				System.out.println("Hangi harfi saymak istiyosunuz ");
				String harf = scanner.nextLine();
				if (!kelime.contains(harf)) {
					System.out.println("Aradgınız harf kelimenin içinde yoktur");
				} else {
					for (int i = 0; i < kelime.length(); i++) {
						if (kelime.charAt(i) == harf.charAt(0)) {
							sayac++;
							indexler += i + ",";
						}
					}
					// 3,4,5,6,1,
					// substring
					System.out.println(harf + " harfi kelime içinde " + sayac + " adet bulunuyor");
					System.out.println(
							harf + " değerinin indexleri ===> " + indexler.substring(0, indexler.length() - 1));
					// 1,2,5,7 indexte bulunuyo

				}
				break;
			case 2:
				System.out.println("Lütfen bir kelime giriniz: ");
				String kelime2 = scanner.nextLine();
				System.out.println("Değiştirmek istediğiniz harf: ");
				String eskiHarf = scanner.nextLine();
				System.out.println("Neyle değiştricez: ");
				String yeniHarf = scanner.nextLine();
				if (kelime2.contains(eskiHarf)) {
					kelime2 = kelime2.replace(eskiHarf, yeniHarf);
				} else {
					System.out.println(eskiHarf + " mevcut dğeil");
				}
				System.out.println(kelime2);

				break;
			case 3:
				System.out.println("Lütfen bir kelime giriniz: ");
				String kelime3 = scanner.nextLine();
				String isPalindrom = "";

				System.out.println(kelime3.length() - 1);
				System.out.println(kelime3.length());

				for (int i = kelime3.length() - 1; i >= 0; i--) {
					isPalindrom += kelime3.charAt(i);
				}
				// String isPalindrom = "kayak"
				// Stringler == --> referans adreslerini
				// equlals() --> direkt değer bakayıyor.

				if (isPalindrom.equals(kelime3)) {
					System.out.println("kelime plaindrom");
				} else {
					System.out.println("palindrom değil");
				}

				System.out.println("*************");
				boolean kontrol2 = true;
				for (int i = 0; i < kelime3.length() / 2; i++) {
					// kayak i=0 , 1
					// k == k
					// a == a
					//
					if (!(kelime3.charAt(i) == (kelime3.charAt(kelime3.length() - 1)) - i)) {
						kontrol = false;
						break;
					}
				}
				if (kontrol2) {
					System.out.println("kelime plaindrom");
				} else
					System.out.println("palindorm değil");

				break;
			case 4:
				StringBuilder stringBuilder = new StringBuilder();
				System.out.println("kelime giriniz");
				String kelime4 = scanner.nextLine();
				for (int i = 0; i < kelime4.length(); i++) {
					stringBuilder.append(kelime4.charAt(i) + "?");
				}
				String yeni = stringBuilder.toString();
				System.out.println(yeni);
				// java
				// i =0 -> j?a?v?a?
				System.out.println(stringBuilder.substring(0, stringBuilder.length() - 1));
				break;
			case 5:
				System.out.println("kelime giriniz");
				String kelime5 = scanner.nextLine();
				String kelime6 = kelime5.substring(0, 3);
				String eklencekSekil = "...";
				System.out.println(kelime6 + eklencekSekil);
				break;
			case 6:
				System.out.println("kelime giriniz");
				String kelime7 = scanner.nextLine();
				String kelime8 = "";
				for (int i = 0; i < kelime7.length(); i++) {
					if (i < 3) {
						kelime8 += kelime7.charAt(i);
					} else {
						kelime8 += ".";
					}
				}
				System.out.println(kelime8);
				break;
			case 0:
				kontrol = false;
				System.out.println("Çıkıs yapıldı");
				break;

			default:
				break;
			}
		}

	}
}