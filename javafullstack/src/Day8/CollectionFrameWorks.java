package Day8;
import java.util.*;
//**********     Types Of Cursors   *********************
//Example for Iterator
//public class CollectionFrameWorks {
//	public static void main(String[] args) {
//	List<Integer>l1=new ArrayList<Integer>();
//	l1.add(12);
//	l1.add(13);
//	l1.add(14);
//	System.out.println(l1);
//	Iterator i1=l1.iterator();
//	while( i1.hasNext()) {
//		System.out.println(i1.next());
//	}
//	}
//
//}
//Example for ListIterator
//public class CollectionFrameWorks {
//public static void main(String[] args) {
//List<Integer>l1=new ArrayList<Integer>();
//l1.add(12);
//l1.add(13);
//l1.add(14);
//System.out.println(l1);
//ListIterator i1=l1.listIterator();
//System.out.println("***FarWord Direction*****");
//while( i1.hasNext()) {
//	System.out.println(i1.next());
//
//}
//System.out.println("***BackWord Direction*****");
//while(i1.hasPrevious()) {
//	System.out.println(i1.previous());
//}
//}
//
//}
//Enumerator Example
   public class CollectionFrameWorks {
public static void main(String[] args) {
Vector<Integer>l1=new Vector<Integer>();
l1.add(12);
l1.add(13);
l1.add(14);
System.out.println(l1);
Enumeration l=l1.elements();

while(l.hasMoreElements()) {
	System.out.println(l.nextElement());

}

}

}

