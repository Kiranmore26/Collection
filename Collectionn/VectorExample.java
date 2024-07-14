package Collectionn;

import java.util.Vector;

public class VectorExample 
{
	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.addElement("AAA");
		v.addElement("BBB");
		v.addElement("DDD");
		
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		v.removeAllElements();
		System.out.println(v);
	}
}
