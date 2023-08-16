package lesson3;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//-> kullanırsan breake gerek kalmıyor . örnek case1,2,3,4,5 -> sout ....
		Scanner scanner = new Scanner(System.in);
		int sayı;
		System.out.println("bir sayı giriniz : ");
		sayı=scanner.nextInt();
		
		
		switch (sayı) {
		case 1:System.out.println("pazartesi");
			
			break;
		
		case 2:System.out.println("salı");
		break;
		case 3:System.out.println("çarşamba");
		break;
		case 4:System.out.println("perşembe");
		break;
		case 5:System.out.println("cuma");
		break;
		case 6:System.out.println("cumartesi");
		break;
		case 7:System.out.println("pazar");
		break;
		
		default:
			break;
		}

	}

}
