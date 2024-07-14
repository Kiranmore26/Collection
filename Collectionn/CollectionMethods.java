package Collectionn;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethods 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		
		System.out.println(al);
		
		al.remove(0);
		System.out.println(al);
		
		
		
		ArrayList al2 =new ArrayList();
		al2.add("aaa");
		al2.add("bbb");
		al2.add("ccc");
		System.out.println(al2);
		
		
		System.out.println(al2.contains("aaa"));
		
		System.out.println(al2.size());
		
		al2.addAll(al);
		System.out.println(al2);
		
		System.out.println(al2.size());
	
		al2.remove("ccc");
		System.out.println(al2);
	}
}
