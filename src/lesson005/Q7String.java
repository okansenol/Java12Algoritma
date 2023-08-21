package lesson005;

import java.util.Scanner;

public class Q7String {

	public static void main(String[] args) {
		// harf degiştirme
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

				System.out.println("Hangi harfi değiştirmek istiyosunuz ");
				String harf = scanner.next();
				System.out.println("neyle değştirmek istiyorsunuz ");
				String harfYeni = scanner.next();
				if (!kelime.contains(harf)) {
					System.out.println("Aradıgınız harf kelimede yoktur");
				} else {
					kelime=kelime.replace(harf,harfYeni);
					
						}
				System.out.println(kelime);
			}

		}
	}
}
