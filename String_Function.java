package StringPackage;

import java.util.Scanner;

public class String_Function {

	public static void main(String[] args) 
	{
		System.out.println("Enter First name");
		Scanner S1 = new Scanner(System.in);
		String name = S1.nextLine();
		
		
		System.out.println("Enter Second name");
		Scanner S2 = new Scanner(System.in);
		String name1 =S2.nextLine();
		
		boolean b = name.contains(name1);
		System.out.println("Check "+name +" Contains in second string :" +b);
		
		String joint_names=name.concat(name1);
		System.out.println("Concatination of name and name 1: "+joint_names);
		
		char position=name.charAt(3);
		System.out.println("Characher at : "+position);
		
		
		int index=name1.indexOf('a');
		System.out.print("Index of Position :"+index);
		S1.close();
		S2.close();
	}

}
