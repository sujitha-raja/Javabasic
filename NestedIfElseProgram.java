package Java_Programs;

public class NestedIfElseProgram {
	public static void main(String args[])
	{
	int a,b,c;
	a=1;
	b=2;
	c=4;
	if(a>b)
	{
		if(a==c)
		{
			System.out.println("A is equal to C");
		}
		else
		{
			System.out.println("A is not equal to C");
		}
	}
	
	else
	{
		System.out.println("A is not greater than B");
	}

	}
}
