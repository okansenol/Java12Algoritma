package lesson003;

import java.util.Iterator;
import java.util.Scanner;

public class StringCalisma1 {

	public static void main(String[] args) {
		// girilen kelimenin harflerini alt alta yazdır.
		Scanner scanner=new Scanner(System.in);
		System.out.println("bir kelime giriniz: ");
		String kelime;
		kelime=scanner.next();
		
		for (int i = 0; i < kelime.length(); i++) {
			System.out.println(kelime.charAt(i));
		}
	
		

	}

}
