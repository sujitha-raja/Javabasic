package StringPackage;

import java.util.Scanner;

public class String_SubstringFunction {

	public static void main(String[] args) {
		
		System.out.println("Enter String first");
		Scanner S1 = new Scanner(System.in);
		String name=S1.nextLine();
		 String s= name.substring(3);
		 System.out.println("Substring: " +s);
		 
		 System.out.println("Enter String two");
		 Scanner S2 = new Scanner(System.in);
		 String name1=S2.nextLine();
		String m =name1.substring(2, 6);
		System.out.println("Susbstring with 2 parameters: " +m);
		S1.close();
		S2.close();

	}

}
