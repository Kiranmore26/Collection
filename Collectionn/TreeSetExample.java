package Collectionn;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample 
{
	public static void main(String[] args) 
	{
		TreeSet ts = new TreeSet();
		
		
		ts.add(17);
		ts.add(71);
		ts.add(5);
		ts.add(4);
		ts.add(6);
		ts.add(7);
		ts.add(8);
		ts.add(12);
		ts.add(11);
		ts.add(16);
		ts.add(188);
		ts.add(31);
		
		
		System.out.println(ts);
		
		System.out.println(ts.pollFirst());
		System.out.println(ts);
		
		System.out.println(ts.descendingSet());
		
		
//		
//		Iterator itr=ts.iterator();
//		
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
	}
}
