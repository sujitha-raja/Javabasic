package StringAndArrayPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCopyAndPrintReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[]=new int[3];
		int array2[]=new int[array1.length];
		array1[0]=90;
		array1[1]=80;
		array1[2]=70;
for(int i=0,j=2;i<array1.length;i++,j--)
{
	 array2[j]=array1[i];
}
	System.out.println(Arrays.toString(array1));
	System.out.println(Arrays.toString(array2));
   
	}

}
