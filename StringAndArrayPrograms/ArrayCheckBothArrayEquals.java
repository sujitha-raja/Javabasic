package StringAndArrayPrograms;

import java.util.Arrays;

public class ArrayCheckBothArrayEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[]=new int[3];
		int array2[]=new int[array1.length];
		array1[0]=60;
		array1[1]=70;
		array1[1]=80;
		for(int i=0;i<array1.length;i++)
		{
			array2[i]=array1[i];
			
		}
System.out.println(Arrays.toString(array1));
System.out.println(Arrays.toString(array2));
/*if(Arrays.equals(array1, array2))
{
	System.out.println("Both are equal");
}*/
boolean b=Arrays.equals(array1, array2);
System.out.println(b);
	}

}
