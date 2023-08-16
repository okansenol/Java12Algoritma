package lesson3;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		// girilen sayının basamakları toplamı
		
		Scanner scanner = new Scanner(System.in);
		int sayı;
		
		int toplam=0;
		
		
		System.out.println("sayı giriniz ");
		sayı=scanner.nextInt();
		
		while (sayı!=0) {
			toplam=(sayı%10)+toplam;
			sayı/=10;
			
		
			
		}System.out.println("basanak toplamı: " +toplam);

	}

}
