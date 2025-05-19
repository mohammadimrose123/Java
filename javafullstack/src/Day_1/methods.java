package Day_1;

public class methods {
	int a=10,b=20;
	static int x=30,y=40;
	void add() {
		int z=12,c=13;
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(z+c);
		
	}
	static void mul() {
		int l=12,m=4;
		System.out.println(l*m);
		System.out.println(x*y);
	}
	public static void main(String[] args) {
		methods m=new methods();
		m.add();
		mul();
	}

}
