package ListIterator_Package;

public class ReverseStringProgram {

	public static void main(String[] args) {
		String a ="Sujitha";
		String output="";
		
		for(int i =a.length()-1;i>=0;i--)
		{
			
			char b = a.charAt(i);
			output = output + b;
		}
		
		System.out.println(output);

	}

}
