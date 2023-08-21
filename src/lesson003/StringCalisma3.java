package lesson003;

import java.util.Scanner;

public class StringCalisma3 {

	public static void main(String[] args) {
		// girilen kelimenin içinde kaç tane e harfi var onu bulalım
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("bir kelime giriniz: ");
		String kelime;
		kelime=scanner.next();
		int sayac=0;
		
		for (int i = 0; i < kelime.length(); i++) {
			
			if (kelime.charAt(i)=='e') {
				sayac+=1;
				
				
			}
		}System.out.println(sayac+" tane e harfi vardır");

	}

}
