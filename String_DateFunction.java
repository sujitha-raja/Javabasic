package StringPackage;

import java.util.*;

public class String_DateFunction {

	public static void main(String[] args) 
	{
		Date d = new Date();
		long sysdate=d.getTime();
		System.out.println("System understandable date: "+sysdate);
	
		Date d2 = new Date(d.getTime());
		System.out.println("Human Understable date " + d2);
		
		String format = d2.toString(); // // first convert date to string
		
		int l =format.length();
		System.out.println("Length of Human Understable date: " +l);
		
		

	}

}
