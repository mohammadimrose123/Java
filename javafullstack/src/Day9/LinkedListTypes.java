package Day9;
import java.util.*;

public class LinkedListTypes {
//	public static void main(String[] args) {
//		LinkedList<Integer>ll=new LinkedList<Integer>();
//		//Before performing methods of LinkedList
//		ll.add(10);
//		ll.add(20);
//		ll.add(30);
//		ll.add(40);
//		System.out.println(ll);
//		System.out.println("*******************");
//		//After performing Inserting methods of LinkedList 
//		ll.addFirst(25);
//		ll.add(1,15);
//		ll.addLast(50);
//		System.out.println(ll);
//		
//		
//	}
//}
	//_______________________________________________________
	public static void main(String[] args) {
		LinkedList<Integer>ll=new LinkedList<Integer>();
		//Before performing methods of LinkedList
		ll.add(10);
		ll.add(20);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		System.out.println(ll);
		System.out.println("*******************");
		//After performing Removing  methods of LinkedList 
		ll.removeFirst();
		ll.remove(3);
		ll.removeLast();
		ll.removeFirstOccurrence(20);
		System.out.println(ll);
		
		
	}
}
//**********************Succussfully Completed*****************
