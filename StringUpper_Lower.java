package StringPackage;

import java.util.Scanner;

public class StringUpper_Lower {

	public static void main(String[] args) {
		System.out.println("Enter string one ");
		Scanner S1 = new Scanner(System.in);
		String c=S1.nextLine();  
		
		System.out.println("Enter string two ");
		Scanner S2 = new Scanner(System.in);
		String c2=S2.nextLine(); 
		
		//String a ="Sujitha";
		//String b="Sujitha Muthuraja";
		int size = c.length();// to find length of the string
		System.out.println("First String Size is: "+size);
       String upper = c.toUpperCase();// convert to uppercase
       String lower =c.toLowerCase(); //convert to lowercase
       System.out.println("First string coverted to uppercase: "+upper);
       System.out.println("First string converted to lowercase: "+lower);
       
      boolean b1= c.equals(c2);
      System.out.println("Stirng one and two is equal say in true or false: "+ b1);
      
      System.out.println("check equal ignore case");
      boolean b2 = c2.equalsIgnoreCase(c);
      System.out.println("Equal Ignore case: "+b2);
      S1.close();
      S2.close();
      
	}

}
