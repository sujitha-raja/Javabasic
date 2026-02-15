package StringAndArrayPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCopyOneToAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[]=new int[3];
		array1[0]=56;
		array1[1]=76;
		array1[2]=88;		
int array2[]=new int[array1.length];
for(int i=0;i<array1.length;i++)
{
	array2[i]=array1[i];
}
System.out.println(Arrays.toString(array2));
	}

}
