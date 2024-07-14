package Collectionn;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample 
{
	public static void main(String[] args) 
	{
		Queue q = new PriorityQueue();
		
		q.offer("200");
		q.offer("900");
		q.offer("200");
		q.offer("500");
	
		
		
	
		q.offer("500");
		
		System.out.println(q);
	}
}
