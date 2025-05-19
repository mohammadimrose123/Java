package Day_3;

abstract class test {
	abstract void add();
	abstract void sub();

	static void mul() {
		System.out.println("mulitiplication");
	}
	void div() {
		System.out.println("Division");
	}
	void mod() {
		System.out.println("Modulus");
	}
}
class test4 extends test{
	public void add() {
		System.out.println("Addition");
	}
	public void sub() {
		System.out.println("Subtraction");
	}
}
	class test2{
	public static void main(String[] args) {
		test4 t1=new test4();
		t1.add();
		t1.sub();
		t1.mul();
		t1.div();
		t1.mod();
	}
	}



