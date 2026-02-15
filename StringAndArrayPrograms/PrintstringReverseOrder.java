package StringAndArrayPrograms;

public class PrintstringReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Sujitha";
		String reversename="";
		for(int i=name.length()-1;i>=0;i--)
		{
			char c=name.charAt(i);
			reversename=reversename+c;
		}
    System.out.println(reversename);
	}

}
