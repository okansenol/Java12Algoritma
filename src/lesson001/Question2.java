package lesson001;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("ilk degeri giriniz : ");
		int deger1= scanner.nextInt();
		System.out.println("ikinci degeri giriniz : ");
		int deger2= scanner.nextInt();
		
		System.out.println("sonuc : " + deger1*deger2);

	}

}
