package lesson005;

import java.util.Scanner;

public class Q1String {

	public static void main(String[] args) {
		// girilen kelimenin harflerini alt alta versin
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("kelime giriniz: ");
		String kelime=scanner.next();
		
		for (int i = 0; i < kelime.length(); i++) {
			System.out.println(kelime.charAt(i));
			
		}
				

	}

}
