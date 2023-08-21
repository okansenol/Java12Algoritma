package lesson003;

import java.awt.TexturePaint;
import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		// girilen iki sayının toplamı
		// çift ise true tek ise false
		// boolean yazdıralım
		Scanner scanner = new Scanner(System.in);
		boolean ciftMi;
		System.out.println("1.sayi: ");
		int sayi1 = scanner.nextInt();

		System.out.println("2.sayi :");
		int sayi2 = scanner.nextInt();

		int toplam = sayi1+sayi2;
		if (toplam % 2 == 0) {
			ciftMi = true;
		} else {
			ciftMi = false;

		}
		System.out.println(ciftMi);

	}

}
