package lesson002;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		double sayi1;
		double sayi2;
		double sayi3;
		
		System.out.println("1. sayiyi giriniz : ");
		sayi1=scanner.nextDouble();
		System.out.println("2. sayiyi giriniz : ");
		sayi2=scanner.nextDouble();
		System.out.println("3. sayiyi giriniz : ");
		sayi3=scanner.nextDouble();
		
		if (sayi1>sayi2&& sayi1>sayi3) {
			System.out.println("en büyük sayı : " + sayi1);
		
			
		}else if (sayi2>sayi1&&sayi2>sayi3) {
			System.out.println("en buyuk sayi : " + sayi2);
			
			
		}else {
			System.out.println("en buyuk sayi : " + sayi3);
		}
		

	}

}
