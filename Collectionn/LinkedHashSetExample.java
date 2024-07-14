package Collectionn;

import java.util.LinkedHashSet;

public class LinkedHashSetExample 
{
	public static void main(String[] args) {
		
		LinkedHashSet ls = new LinkedHashSet();
		
		ls.add("AAA");
		ls.add("BBB");
		ls.add("CCC");
		ls.add(null);
		ls.add(null);
		ls.add("DDD");
		ls.add(100);
		ls.add(100);
		
		
		System.out.println(ls);
	}
}
