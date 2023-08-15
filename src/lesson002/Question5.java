package lesson002;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// girilen tl yi dolara cevir
		Scanner scanner = new Scanner(System.in);
		
		double guncelDolarDegeri= 27.06;
		
		System.out.println("Tl miktariniz giriniz : ");
		double tl = scanner.nextDouble();
		double hesaplananDolarDegeri= tl/ (guncelDolarDegeri);
		

		System.out.println("dolar miktari " + hesaplananDolarDegeri);
		

	}

}
