package lesson005;

import java.util.Scanner;

public class Q8String {

	public static void main(String[] args) {
		//polindrom mu degil mi
		Scanner scanner = new Scanner(System.in);

		boolean kontrol = true;
		while (kontrol) {
			System.out.println("====String işlemleri====");
			System.out.println("1- Harf Değiştirme");

			System.out.println("0- Çıkış");

			int secim = scanner.nextInt();
			// scanner.nextLine();

			switch (secim) {
			case 1:

				System.out.println("Kelime giriniz:");
				String kelime = scanner.next();
				String tersi = "";

				for (int i = 0; i < kelime.length(); i++) {
					tersi = kelime.charAt(i) + tersi;
				}
				if (kelime.equals(tersi)) {
					System.out.println("polindrom");
				} else {
					System.out.println("polindrom değildir");
				}

			}

		}

	}
}
