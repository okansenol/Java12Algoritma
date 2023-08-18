package lesson004;

import java.util.Scanner;

public class ForOrnekJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Hesap makinesi
		// + - * /

		// switch case

		// veya

		// Toplam için 1i tuşla
		// Çıkarma için 2yi tuşla

		Scanner scanner = new Scanner(System.in);

		System.out.println("İşlem yapılcak sayi");
		double sayi1 = scanner.nextDouble();

		System.out.println("Hangi işlemi yapacaksınız");
		String operator = scanner.next();

		double sonuc = 0;

		while (sayi1 != 0) {
			switch (operator) {
			case "+":
				sonuc += sayi1;
				break;
			case "-":
				sonuc -= sayi1;
				break;
			case "*":
				sonuc *= sayi1;
				break;
			case "/":
				sonuc /= sayi1;
				break;
			default:
				System.out.println("Geçerli işlem yapınız");
				break;
			}
			System.out.println("Sonuc " + sonuc);
			System.out.println("Sayi ekle");
			sayi1 = scanner.nextDouble();
			System.out.println("Operator ekle");
			operator = scanner.next();
		}

		// kullanıcı 0 girene sayıları alalım

		// Alternatif çözüm

		/*
		 * 
		 * System.out.println("İşlem türünü giriniz ( * / - + ).");
		 * 
		 * String ıslemTuru = scanner.next();
		 * 
		 * System.out.println("1. Sayıyı giriniz");
		 * 
		 * int userNum1 = scanner.nextInt(); System.out.println("2. Sayıyı giriniz");
		 * int userNum2 = scanner.nextInt();
		 * 
		 * double sonuc = switch (ıslemTuru) { case "+" -> { yield userNum1 + userNum2;
		 * } case "-" -> { yield userNum1 - userNum2; } case "*" -> { yield userNum1 *
		 * userNum2; } case "/" -> { yield userNum1 / userNum2; } default -> 0;
		 * 
		 * }; System.out.println(userNum1 + " " + ıslemTuru + " " + userNum2 + " = " +
		 * sonuc);
		 */

	}

}
