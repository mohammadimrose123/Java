package Day_5;
class test{
	void add() {
		System.out.println("hi");//overridden example
	}
}

public class runtimepolymorphism extends test{
	void add() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		
	  runtimepolymorphism r=new runtimepolymorphism();
	  r.add();
	}
	
}

