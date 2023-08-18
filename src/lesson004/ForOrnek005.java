package lesson004;

import java.util.Scanner;

public class ForOrnek005 {

	public static void main(String[] args) {
		// taban değeri ve üst değeri alacağız. örnek 2 üzeri 5 i hesapla
		Scanner scanner = new Scanner(System.in);
		int sayı;
		int üst;
		int sonuc = 1;

		System.out.println("sayı giriniz: ");
		sayı = scanner.nextInt();
		System.out.println("üst giriniz: ");
		üst = scanner.nextInt();

		for (int i = 1; i <= üst; i++) {
			sonuc *= sayı;

		}
		System.out.println(sonuc);
		int j = 1;
		int carpım = 1;

		while (j <= üst) {
			carpım *= sayı;
			j++;

		}
		System.out.println(sayı + "üzeri" + üst + ": " + carpım);

	}

}
