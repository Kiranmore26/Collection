package Collectionn;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample 
{
	public static void main(String[] args) 
	{
		Set l = new HashSet();
		l.add(10);
		l.add(60);
		l.add(30);
		l.add(50);
		l.add(40);
		
		Iterator itr=l.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println(l);
	}
}
