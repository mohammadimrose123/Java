package Day_1;

public class area {
	int s=4;
	static int r=2,l=2,b=3;
	void areaofcircle() {
		System.out.println("area of circle:"+3.14f*r*r);
			
	}
	static void rectangle() {
		System.out.println("area of rectangle:"+l*b);
	}
	void areaofsquare() {
		System.out.println("area of square:"+s*s);
	}
	static void triangle() {
		int b=12,h=10;
		System.out.println("area of triangle:"+0.5f*b*h);
	}
	public static void main(String[] args) {
		area a=new area();
		a.areaofcircle();
		rectangle();
		a.areaofsquare();
		triangle();
		
	}

}
