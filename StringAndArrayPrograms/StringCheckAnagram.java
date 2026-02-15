package StringAndArrayPrograms;

import java.util.Arrays;

public class StringCheckAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1="post";
		String name2="stop";
		if(name1.length()!=name2.length())
		{
			System.out.println("Both length are not same so never be anagram");
		}
		else
		{
		char c1[]=name1.toCharArray();
		char c2[]=name2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(Arrays.equals(c1, c2))          //Arrayfunction
		{
			System.out.println("Its an Anagram");
		}
		else
		{
			System.out.println("Its not an anagram");
		}
		}
	}

}
