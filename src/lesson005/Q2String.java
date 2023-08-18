package lesson005;

import javax.swing.Spring;

public class Q2String {

	public static void main(String[] args) {
		// java,string,postgre,react
		//String text="java,string,postgre,react";
		//java
		//spring
		//postgre
		//react
		
	   // ---çözüm1 substring---
	    String text = "Java,Spring,Postgre,React";
			
			int index = 0;
			for (int i = 0; i < text.length(); i++) {
				if (text.charAt(i) == ',') {
					System.out.println(text.substring(index, i));
					index = i + 1;
				}
			}
			System.out.println(text.substring(index));
	    
	    
	    
	    //----çözüm2 normal---
	    for (int i = 0; i < text.length(); i++) {
				if (text.charAt(i) == ',') {
					System.out.println();
				} else {
					System.out.print(text.charAt(i));
				}
			}
	    


	}

}
