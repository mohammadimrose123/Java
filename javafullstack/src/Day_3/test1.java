package Day_3;

abstract class test1 {
	abstract void show();
	abstract void display();
}
class demo extends test1 {
	public void show() {
		System.out.println("abstraction");
	}
	public void display() {
		System.out.println("learning");
	}

public static void main(String[] args) {
	demo d1=new demo();
	d1.show();
	d1.display();
}
}