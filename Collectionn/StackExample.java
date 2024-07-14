package Collectionn;

import java.util.Iterator;
import java.util.Stack;

public class StackExample 
{
	public static void main(String[] args) 
	{
		Stack s = new Stack();
		s.push("Kiran");
		s.push("Xyz");
		s.push("AAA");
		s.add("KKKK");
		s.push("AAA");
		s.push("BBB");
		
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s.search("Xyz"));
		System.out.println("peek element : "+s.peek());
		
		
		
		
	}
}
