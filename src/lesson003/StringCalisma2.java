package lesson003;

import java.util.Iterator;

public class StringCalisma2 {

	public static void main(String[] args) {
		// Java,Spring,Postgre,React
		// Java
		// Spring
		// Postgre
		// React şeklinde çıktı alalım

		/*
		 * String text="Java,Spring,Postgre,React";
		 * 
		 * for (int i = 0; i < text.length(); i++) { if (text.charAt(i)==',') {
		 * System.out.println(); }else { System.out.print(text.charAt(i)); } }
		 */

		   String text = "Java,Spring,Postgre,React";
	        int startIndex=0;

	            for (int i = 0; i < text.length(); i++) {
	                if (text.charAt(i) == ',') {
	                    System.out.println(text.substring(startIndex,i));
	                    startIndex=i+1;
	                }
	            }

	        System.out.println(text.substring(startIndex,text.length()));

	}
}