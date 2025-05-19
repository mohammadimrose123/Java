package Day_4;
class test
 {
	int a;
	int b;
	public test(int x,int y) {
		a=x;
		b=y;
		System.out.println(x+y);
	}
	public void add() {
		System.out.println(this.a-this.b);
	}
 }
	public class thiskeyword{
	public static void main(String[]args) {
		test t=new test(78,34);
		t.add();
	}

}
