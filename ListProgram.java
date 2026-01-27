package ListIterator_Package;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListProgram {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(1);
		a1.add(34);
		a1.add(45);
		a1.add(null);
		ListIterator<Integer> i =a1.listIterator();
		System.out.println("Forward Iteration");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("Backward Iteration");
		while(i.hasPrevious())
		{
			System.out.println(i.previous());
		}
			

	}

}
