package lesson002;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.println("1.sayı giriniz");
		num1=scanner.nextInt();
		System.out.println("2.sayıyı giriniz : ");
		num2=scanner.nextInt();
		
		if (num1>num2) {
			System.out.println("büyük sayi : " +num1);
			
		}else {
			System.out.println("büyük sayi : " +num2);
			
		}

	}

}
