package Day_2;

public class typecaste {
	public static void main(String[] args) {
		//implict conversion
		Integer b=10;//Integer is a wraper class and b is object
		int a=b;
		System.out.println(a);
		System.out.println(b.getClass());
		//explict conversion
		int c=89;
		Integer l=Integer.valueOf(c);
		System.out.println(l.getClass());
		
	}

}
