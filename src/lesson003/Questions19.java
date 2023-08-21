package lesson003;

import java.util.Scanner;

public class Questions19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int sayı;
		
		System.out.println("sayı giriniz");
		sayı=scanner.nextInt();
		
		String besinKatimi="5 in katı değildir";
		
		while (sayı!=1) {
			if (sayı%5!=0) {
				besinKatimi="5 in kuvveti değildir";
				sayı=1;
				
			}else {
				besinKatimi="beşin katıdır";
				sayı/=5;
				
			}
		}System.out.println(besinKatimi);
		
		
		
		
			
		}

	}


