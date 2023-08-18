package lesson004;

import java.util.Scanner;

public class ForOrnek002 {

	public static void main(String[] args) {
		// girilens ayı için çarpım tablosu veren program. örn= 6 girildi 6*1=6 6*2=12 6*10 a kadar
		//çarpım tablosu
		
		//for (int j = 1; j <= 10; j++) {
		//System.out.println(i+"*"+j+"="+i*j); çarpım tablosu
		
		Scanner scanner=new Scanner(System.in);
		int sayı;
		
		
		System.out.println("sayı giriniz: ");
		sayı=scanner.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println(sayı+"*"+i+"="+i*sayı);
			
			
		}
		
		

	}

}
