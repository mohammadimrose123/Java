package Day9;

import java.util.Enumeration;
import java.util.Vector;

public class Vectors {

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
