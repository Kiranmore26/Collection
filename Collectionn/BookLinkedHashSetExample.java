package Collectionn;

import java.util.Iterator;
import java.util.LinkedHashSet;

class Books
{  
	int id;  
	String name,author,publisher;  
	int quantity;  
	
	public Books(int id, String name, String author, String publisher, int quantity) 
	{  
	    this.id = id;  
	    this.name = name;  
	    this.author = author;  
	    this.publisher = publisher;  
	    this.quantity = quantity;  
	}  

	public String toString() 
	{
	    return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher + ", quantity=" + quantity + "]";
	}


} 


public class BookLinkedHashSetExample 
{
	public static void main(String[] args) 
	{  
    LinkedHashSet<Books> hs=new LinkedHashSet<Books>();  
    
    //Creating Books  
    Books b1=new Books(101,"Let us C","Yashwant Kanetkar","BPB",8);  
    Books b2=new Books(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    Books b3=new Books(103,"Operating System","Galvin","Wiley",6); 
    
    
    //Adding Books to hash table  
    hs.add(b1);  
    hs.add(b2);  
    hs.add(b3);  
    
   
    
    Iterator<Books> itr = hs.iterator();
    while (itr.hasNext()) 
    {
        System.out.println(itr.next().toString());
    }
}

}
