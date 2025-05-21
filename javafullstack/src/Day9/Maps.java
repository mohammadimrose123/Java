package Day9;
//Map is a Interface it can be implemented by 4 classes
//1.HashMap with methods
//import java.util.*;
//public class Maps {
//	public static void main(String[] args) {
//		Map<Integer,String>m1=new HashMap<Integer,String>();
//		m1.put(1,"CSE");
//		m1.put(3, "ECE");
//		m1.put(2, "EEE");
//		m1.put(6, null);//It allows null values
//		m1.put(5, "MECH");
//		m1.put(4, "CIVIL");
//		System.out.println(m1);//Elements are printed in unordered
//		for(Map.Entry<Integer,String> i:m1.entrySet()) {
//			System.out.println(i.getValue());
//			System.out.println(i.getKey());
//		}		
//	}
//}
//____________________________________________________
//LinkedHashMap
//import java.util.*;
//public class Maps {
//	public static void main(String[] args) {
//		Map<Integer,String>m1=new LinkedHashMap<Integer,String>();
//		m1.put(1,"CSE");
//		m1.put(3, "ECE");
//		m1.put(2, "EEE");
//		m1.put(6, null);
//		m1.put(5, "MECH");
//		m1.put(4, "CIVIL");
//		System.out.println(m1);//Elements are printed insertion order 
//		for(Map.Entry<Integer,String> i:m1.entrySet()) {
//			System.out.println(i.getValue());
//			System.out.println(i.getKey());
//		}		
//	}	
//	}
//_______________________________________________________
//3.TreeMap
import java.util.*;
public class Maps {
	public static void main(String[] args) {
		Map<Integer,String>m1=new TreeMap<Integer,String>();
		m1.put(1,"CSE");
		m1.put(3, "ECE");
		m1.put(2, "EEE");
		m1.put(6,null);
//		m1.put(6, null);
		m1.put(5, "MECH");
		m1.put(4, "CIVIL"); 
		System.out.println(m1);//Elements are printed sorted order
		for(Map.Entry<Integer,String> i:m1.entrySet()) {
			System.out.println(i.getValue());
			System.out.println(i.getKey());
		}
			
	}
	}

	



	


