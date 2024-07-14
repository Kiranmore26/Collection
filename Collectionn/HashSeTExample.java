package Collectionn;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSeTExample 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add("VVVVVVV");
		al.add("FFFFf");
		al.add("iiii");
		System.out.println(al);
		
		HashSet hs = new HashSet();
		hs.addAll(al);
		hs.add(10);
		hs.add(100);
		hs.add(54);
		hs.add("Kiran");
		hs.add("AAAA");
		
		
		System.out.println(hs);
	}
}
