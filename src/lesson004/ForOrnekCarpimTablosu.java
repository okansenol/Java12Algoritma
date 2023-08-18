package lesson004;

import java.util.Scanner;

public class ForOrnekCarpimTablosu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("1. sayı giriniz");
		int sayi3 = sc.nextInt();

		String operator = "";
		System.out.println("işlem yapılacak sayı");
		double sayi = sc.nextInt();
		System.out.println("yapılacak işlem");
		operator = sc.next();

		double sonuc = sayi;

		while (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {

			System.out.println("işlem yapılacak sayı");
			double sayi2 = sc.nextInt();
			switch (operator) {
			case "+":
				sonuc = sonuc + sayi2;

				break;
			case "-":
				sonuc = sonuc - sayi2;

				break;
			case "*":
				sonuc = sonuc * sayi2;

				break;
			case "/":
				sonuc = sonuc / sayi2;

				break;

			default:
				operator = "";
				break;
			}
			System.out.println("yapılacak işlem");
			operator = sc.next();

		}

		System.out.println(sonuc);

	}

}
