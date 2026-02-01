package Java_Programs;

public class CallStaticMethodInMainMethod {
	
	static void methodAccessInMainMethod()
	{
		System.out.println("Called in main method");
	}
	void withOutStaticMethod()
	{
		System.out.println("Static method call me in main method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodAccessInMainMethod();
		CallStaticMethodInMainMethod c1=new CallStaticMethodInMainMethod();
		c1.withOutStaticMethod();

	}

}
