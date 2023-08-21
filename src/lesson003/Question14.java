package lesson003;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int sayı1;
		int sayı2;
		int sayı3;
		String sayıSıralama;
		
		
		System.out.println("1.sayıyı giriniz: ");
		sayı1=scanner.nextInt();
		System.out.println("2.sayıyı giriniz: ");
		sayı2=scanner.nextInt();
		System.out.println("3.sayıyı giriniz: ");
		sayı3=scanner.nextInt();
		
		if (sayı1>sayı2 && sayı1>sayı3&& sayı2>sayı3) {
			System.out.println("en büyün sayı=" + sayı1 + "ortanca sayı=" + sayı2+ "en küçük sayı=" + sayı3);
		}

	}

}
