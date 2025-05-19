package Day6;
public class thiskeyword {
	int a=10;
	int b=5;
	void add() {
		
		System.out.println("Addition of "+a+" and "+b+" is :"+(a+b));
	}
	void calculate() {
		System.out.println( "Addtion Is:");
		System.out.println("a: "+this.a);
		System.out.println("b: "+this.b);
		this.add();
		
	}
	public static void main(String[] args) {
		thiskeyword t1=new thiskeyword();
		t1.calculate();
	}

}
