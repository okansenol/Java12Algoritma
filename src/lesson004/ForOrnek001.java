package lesson004;

import java.util.Scanner;

public class ForOrnek001 {

	public static void main(String[] args) {
		// girilen sayı asal mı değil mi?
		//boolean ile de çözülür.
		//boolean isPrime=true;
		
		Scanner scanner=new Scanner(System.in);
		int sayı;
		int sayac=0;
		System.out.println("sayı giriniz: ");
		sayı=scanner.nextInt();
		
		for (int i = 2; i < sayı; i++) {
			if (sayı%i==0) {
				sayac++;
				//isPrime=false;
				//break;
			}
			
		}if (sayac==0) //isPrime) 
		{
			System.out.println("asaldır");
			
		}else {
			System.out.println("değildir");
		}
		
				

	}

}
