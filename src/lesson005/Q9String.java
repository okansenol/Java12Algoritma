package lesson005;

import java.util.Scanner;

public class Q9String {

	public static void main(String[] args) {
		// kelimenin harflerinin arasına ? koy
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
				String sonuc = "";
				String secim = "";

				for (int i = 0; i < kelime.length(); i++) {
					sonuc+=kelime.charAt(i)+"?";
					
				}
				System.out.print(sonuc);

			}

		}


	}

}
