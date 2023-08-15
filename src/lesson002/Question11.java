package lesson002;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		double yarıcap;
		
		System.out.println("yarıcap degerini giriniz : ");
		
		yarıcap=scanner.nextDouble();
		
		System.out.println("cevre = " + (2*3.14*yarıcap) + "\n" + " alan = " + (3.14*yarıcap*yarıcap) );

	}

}
