package Day_5;
interface I1{
	abstract void add();
		void sub();
	}
public class interf implements I1 {
	public void add() {
		System.out.println("hello");
	}
	public void sub() {
		System.out.println("hii");
	}
	public static void main(String[] args) {
		interf i=new interf();
		i.add();
		i.sub();
	}

}
