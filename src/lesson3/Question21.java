package lesson3;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		// girilen sayı hangi basamakta ve hangi sayı
		//372
		//birler basamağı 2 onlar basamağı 7 yüzler basamağı 3
		
		Scanner scanner = new Scanner(System.in);
		int sayı;

		System.out.println("sayı giriniz");
		sayı = scanner.nextInt();
		int basamakSayısı=1;
		int basamak;
		
		
		while (sayı !=0) {
			basamak=sayı%10;
			sayı=sayı/10;
			System.out.println(basamakSayısı+ "ler basamağı " + basamak);
			basamakSayısı=basamakSayısı*10;
			
		}
		

	}

}
