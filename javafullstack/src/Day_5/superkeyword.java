package Day_5;
class sample45{
	public sample45() {
		System.out.println("Good Evening");
		}
	int x=99;
	void print() {
		System.out.println("Hello");
	}
}

public class superkeyword extends sample45{
	public superkeyword() {
		super();
	}
	void show() {
		int y=45;
		super.print();
		System.out.println(super.x);
		System.out.println(y);
		}
	public static void main(String[] args) {
		superkeyword s1=new superkeyword();
		s1.show();
	}

}
