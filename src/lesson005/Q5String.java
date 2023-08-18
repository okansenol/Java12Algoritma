package lesson005;

import java.util.Scanner;

public class Q5String {

	public static void main(String[] args) {
		// kullanıcıdan email password,repassword
		//emailde sadece hotmail.com ve outlook.com uzantılı olanlar olacak
		//password uyusmuyosa ve password uzunluğu 8 den kucukse kabul etme tekrar iste
		//sifre al
		//mail içinde doğru formatta yazmıyosa e maili tekrar iste
		Scanner sc = new Scanner(System.in);

		boolean check = true;
		boolean check2 = true;

		String emailFormat = "@outlook.com";
		String emailFormat2 = "@hotmail.com";
		

		// kelime = java

		// kelime.contains(sa);

		// asd@outlook.com
		// String email = "as@outlook.com@outlook.com";
		// System.out.println(email.substring((email.length() - 12)));

		while (check) {
			System.out.println("Mailinizi girin: ");
			String mail = sc.nextLine();
			int counter = 0;
			if (!(mail.substring((mail.length() - 12)).equals(emailFormat)
					|| mail.substring((mail.length() - 12)).equals(emailFormat2))) {
				
				System.out.println("email formatına uygun değildir");

			} else {
				while (check2) {
					System.out.println("Şifrenizi girin");
					String password = sc.nextLine();

					System.out.println("Şifrenizi tekrar girin");
					String rePassword = sc.nextLine();

					if (password.equals(rePassword) && password.length() >= 8) {
						System.out.println("Giriş başarılı--> " + mail);
						check = false;
						check2 = false;
					} else {
						System.out.println("şifrelerde problem var");
					}
				}
			}
		}

	}

}
