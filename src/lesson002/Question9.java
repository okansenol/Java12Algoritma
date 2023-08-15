package lesson002;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// 
		Scanner scanner = new Scanner(System.in);
		double not;
		
		System.out.println("not giriniz : ");
		not=scanner.nextDouble();
		if (not>100|| not<0) {
			System.out.println("gecerli degerler giriniz");
		}else {
			
		
		if (not>=90&& not<101) {
			System.out.println("AA");
			
		}else if (not>=80 ) {
			System.out.println("BB");
			
		}else if (not>=70 ) {
			System.out.println("CC");
			
		}else if (not>=60  ) {
			System.out.println("DD");
			
		}else {
			System.out.println("FF kaldi");
		}
		

	}

}
	}
