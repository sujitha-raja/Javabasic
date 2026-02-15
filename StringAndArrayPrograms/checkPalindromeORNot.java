package StringAndArrayPrograms;

public class checkPalindromeORNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Madam";
		String reverseno="";
		for(int i=name.length()-1;i>=0;i--)
		{
			char c=name.charAt(i);
			reverseno=reverseno+c;
		}
  if(name.equalsIgnoreCase(reverseno)==true)
  {
	  System.out.println("It is a palindrome");
  }
  else
  {
	  System.out.println("It is not a palindrome");
  }
	}

}
