package Day6;
//inner class example of NestedClass
public class NestedClass { //outer class
	void show() {
		System.out.println("hii");
	}
	class Test1{   // inner class
		void print() {
			System.out.println("hello");
		}
	}
	public static void main(String[] args) {
		NestedClass nc=new NestedClass();
		nc.show();
		NestedClass.Test1 t1=new NestedClass().new Test1();
		t1.print();
	}

}
