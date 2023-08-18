package lesson005;

import java.util.Scanner;

public class Q4String {

	public static void main(String[] args) {
		// girilen kelimede kaç tane e vardır bulalım
		//girilen kelimede kac tane istediğim harften var bulalım

		Scanner scanner = new Scanner(System.in);
		System.out.println("kelime giriniz: ");
		String kelime = scanner.next();
		int harfSayici = 0;

		for (int i = 0; i < kelime.length(); i++) {
			if (kelime.charAt(i) == 'e') {
				harfSayici += 1;// neden i demedik

			}

		}
		System.out.println(harfSayici + " tane e vardır");
	}

}
