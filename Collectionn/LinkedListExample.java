package Collectionn;

import java.util.LinkedList;

public class LinkedListExample 
{
	
	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList();
		ll.add("aaa");
		ll.add("bbb");
		ll.add("ccc");
		ll.add("ddd");
		ll.add("eee");		
		ll.add("ccc");
		ll.addFirst("AAA");
		ll.add("aaa");
		ll.addLast("zzz");
		
		System.out.println(ll);
		System.out.println(ll.getLast());
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll.removeLastOccurrence("ccc"));
		System.out.println(ll);
		
		
		
	
	}
}
