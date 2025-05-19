package Day6;
class Sample26{   //OuterClass
	static void show() {   //static method
		System.out.println("Hi");
	}
	static class Test25{//static with InnerClass
		static void print() { //static method
			System.out.println("Bye");
			show();
		}
	}
}

public class StaticInnerClass {
	public static void main(String[] args) { 
		Sample26.Test25.print();//outerClass.InnerClass.StaticClassMethod 
	}

}
