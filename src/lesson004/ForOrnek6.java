package lesson004;

import java.util.Scanner;

public class ForOrnek6 {

	public static void main(String[] args) {
		// girilen 5 adet sayıdan en büyük ve en küçüğün bulaım
		
		// Klavyeden girilen 0 ile 100 arasında 5 adet sayıdan en büyük
				// ve en küçük olanlı bulalım.

				int sayi;
				int max = Integer.MIN_VALUE;
				int min = Integer.MAX_VALUE;

				// int max = -1;
				// int min = 101;

				System.out.println(max);
				System.out.println(min);

				Scanner scanner = new Scanner(System.in);

				for (int i = 1; i <= 5; i++) {
					System.out.println(i + ". Sayi girin");
					sayi = scanner.nextInt();
					if (sayi <= 0 || sayi >= 100) {
						System.out.println("Lütfen 0 ile 100 arasında girin");
						i--;
					} else {
						if (sayi > max) {
							max = sayi;
						}
						if (sayi < min) {
							min = sayi;
						}
					}

				}
				System.out.println("En büyük: " + max + " En Küçük: " + min);
				
				
				System.out.println("-----------------");
				
				
				
				int j = 1;
				int max2 = Integer.MIN_VALUE;
				int min2 = Integer.MAX_VALUE;
				
				while(j <= 5) {
					System.out.println(j + ". Sayiyi girin");
					int sayi2 = scanner.nextInt();
					
					if (sayi2 <= 0 || sayi2 >= 100) {
						System.out.println("Lütfen 0 ile 100 arasında girin");
					}else {
						if(sayi2 > max2) {
							max2 = sayi2;
						}if(sayi2 < min2) {
							min2 = sayi2;
						}
						j++;
					}
				}
				System.out.println("While ile" +"En büyük: " + max2 + " En Küçük: " + min2);
	}

}
