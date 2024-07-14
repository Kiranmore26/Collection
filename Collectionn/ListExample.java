package Collectionn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample 
{
	public static void main(String[] args) 
	{
		List l = new ArrayList();
		l.add(10);
		l.add("Kiran");
		l.add(30);
		l.add(40);
		l.add("Kiran");
		
		Iterator iterator = l.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		System.out.println(l);
		
		System.out.println(l.get(3));
		
		System.out.println(l.lastIndexOf("Kiran"));
		System.out.println(l.indexOf("Kiran"));
	}
}
