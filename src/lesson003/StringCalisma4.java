package lesson003;

import java.util.Scanner;

public class StringCalisma4 {

	public static void main(String[] args) {
		// // kullanıcıdan email password,repassword
		//emailde sadece hotmail.com ve gmail.com uzantılı olanlar olacak
		//password uyusmuyosa ve password uzunluğu 8 den kucukse kabul etme tekrar iste
		//sifre al
		//mail içinde doğru formatta yazmıyosa e maili tekrar iste
		Scanner scanner=new Scanner(System.in);
		System.out.println("lütfen mail adresinizi giriniz:");
		String mail=scanner.next();
		System.out.println("lütfen şifrenizi giriniz:");
		int sifre=scanner.nextInt();
		System.out.println("şifrenizi tekrar giriniz:");
		int sifreTekrar=scanner.nextInt();
		
		String mailFormat="@hotmail.com";
		String mailFormat2="@gmail.com";
		if (mail) {
			
		}
		
		
		if (sifre==sifreTekrar) {
			System.out.println("sifre doğru");
		}
				

	}

}
