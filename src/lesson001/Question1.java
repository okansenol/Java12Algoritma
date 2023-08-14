package lesson001;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Adiniz : ");
		
		String ad = scanner.next();
		
		System.out.println("Soyadiniz : ");
		
		String soyad = scanner.next();
		
		System.out.println("Hosgeldiniz :  " + (ad +" " + soyad ));

	}

}
