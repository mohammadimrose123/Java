package Day9;
//By using Iterator method
//import java.util.*;
//public class Lists {
//	public static void main(String[] args) {
//		List<Integer>l1=new ArrayList<Integer>();
//		l1.add(12);
//		l1.add(13);
//		l1.add(14);
//		l1.add(13);
//		l1.add(null);
//		System.out.println(l1);
//		Iterator i=l1.iterator();
//		while( i.hasNext()) {
//				
//			System.out.println(i.next());	
//			}		
//		}
//		}
//-----------------------------------------------------
//List merges
//import java.util.*;
//public class Lists {
//	public static void main(String[] args) {
//		List<Integer>l1=new ArrayList<Integer>();
//		l1.add(12);
//		l1.add(13);
//		l1.add(14);
//		List<Integer>l2=new ArrayList<Integer>(l1);
//		l2.add(15);
//		l2.add(16);
//		l2.add(null);
//		System.out.println(l2);
//	}
//}
//---------------------------------------------------
		
//List using addAll method
//		import java.util.*;
//		public class Lists {
//			public static void main(String[] args) {
//				List<Integer>l1=new ArrayList<Integer>();
//				l1.add(12);
//				l1.add(13);
//				l1.add(14);
//				List<Integer>l2=new ArrayList<Integer>(l1);
//				l2.add(15);
//				l2.add(16);
//				l2.addAll(l1);
//				System.out.println(l2);
//			}
//		}
//-----------------------------------------------------------
//List by using Object 
//import java.util.*;
//public class Lists {
//	public static void main(String[] args) {
//		List<Object>l1=new ArrayList<Object>();//allows multiple datatypes
//		l1.add(12);
//		l1.add(13);
//		l1.add(14);
//		l1.add("Apple");
//		l1.add("Banana");
//		System.out.println(l1);
//	}
//}	
//---------------------------------------------------------
//List using extra
//import java.util.*;
//public class Lists {
//	public static void main(String[] args) {
//		List<Object>l1=new ArrayList<Object>();
//		l1.add(12);
//		l1.add(13);
//		l1.add(14);
//		l1.add("Java");
//		l1.add("Java Script");
//		List<Object>extra= Arrays.asList("Virat","Bhumra","Dhoni");	
//		l1.addAll(1,extra);
//		System.out.println(l1);
//	}
//}
//--------------------------------------------------------------------
//example for finding index position 
//import java.util.*;
//public class Lists {
//	public static void main(String[] args) {
//		List<Object>l1=new ArrayList<Object>();
//		l1.add(12);
//		l1.add(13);
//		l1.add(14);
//		l1.add("Java");
//		l1.add("Java Script");
//		List<Object>extra= Arrays.asList("Virat","Bhumra","Dhoni");	
//		l1.addAll(1,extra);
//		System.out.println(l1.get(6));
//		System.out.println(l1.indexOf("Dhoni"));
//	}
//}
//-----------------------------------------------
//converting list into Array
import java.util.*;
public class Lists {
	public static void main(String[] args) {
		List<Object>l1=new ArrayList<Object>();
		l1.add(12);
		l1.add(23);
		l1.add(34);
		l1.add(2,67);
	    System.out.println(l1);
	    List<Object>extra=Arrays.asList(9,89,90);
	    l1.addAll(1,extra);
	    System.out.println(6);
	    System.out.println(l1.get(6));
	    System.out.println(l1.indexOf(90));
	    Object[]arr=l1.toArray();
	    for(Object a1:arr) {
	    	System.out.println(a1);
	    }
	    
	    	
	    }
	}
//-------------- SuccussFully Completed------------------------------------------


