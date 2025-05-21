package Day9;
//Example of HashSet
//import java.util.*;
//public class Sets {
//	public static void main(String[] args) {
//		Set<Integer>s1=new HashSet<Integer>();
//		s1.add(12);
//		s1.add(13);
//		s1.add(null);
//		s1.add(12);
//		s1.add(null);
//		System.out.println(s1);//Elements are printed unordered 
//	}
//
//}
//-----------------------------------------------------------
//Example of LinkedHashSet 
//import java.util.*;
//public class Sets {
//	public static void main(String[] args) {
//		Set<Integer>s1=new LinkedHashSet<Integer>();
//		s1.add(12);
//		s1.add(13);
//		s1.add(null);
//		s1.add(12);
//		s1.add(null);
//		System.out.println(s1);//Elements are printed in insertion order
//	}
//
//}
//--------------------------------------------------
//Example of TreeSet
import java.util.*;
public class Sets {
	public static void main(String[] args) {
		Set<Integer>s1=new TreeSet<Integer>();
		s1.add(12);
		s1.add(13);
//		s1.add(null);//Doesnot allow null values
		s1.add(12);
		s1.add(9);

		System.out.println(s1);//Elements are printed in sorted ordered
	}

}
//---------------------------------------------------
