package StringAndArrayPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMergeTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int array1[] = new int [3];
     array1[0]=1;
     array1[1]=2;
     array1[2]=3;
     int array2[] = new int [3];
     array2[0]=4;
     array2[1]=5;
     array2[2]=6;
     int array3[]=new int[array1.length+array2.length];
     for(int i=0;i<array1.length;i++)
     {
    	 array3[i]=array1[i];
     }
     for(int j=0;j<array2.length;j++)
     {
    	 array3[array1.length+j]=array2[j];
     }
     System.out.println(Arrray Merge);
     System.out.println(Arrays.toString(array1));
     System.out.println(Arrays.toString(array2));
     System.out.println(Arrays.toString(array3));
	}

}
