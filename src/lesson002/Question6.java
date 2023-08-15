package lesson002;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// Kullanicidan alınan vize ve final notlarını hesaplayarakgeçip geçmediğini
		// hesapla
		// vie %40
		// final % 60
		// 50 den büyükse geçsin
		// (-) kontrolü yapalım ve 100 den fazla not girilmesin

		Scanner scanner = new Scanner(System.in);

		int vize;
		int finall;

		System.out.println("vize notunuz giriniz : ");
		vize = scanner.nextInt();

		System.out.println("final notunu giriniz : ");
		finall = scanner.nextInt();
		
		if (vize<0 || finall <0 || vize>0 || finall>0 ) {
			System.out.println("dogru deger girin");
		}else {
			double sonuc = vize * 0.4 + finall * 0.6;
			System.out.println("sonuc : " + sonuc);


		
		if (sonuc >= 50) {
			System.out.println("gectiniz");

		} else {
			System.out.println("kaldınız");
		}

	}

}}
