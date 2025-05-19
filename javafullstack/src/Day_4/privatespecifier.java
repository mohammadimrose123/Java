package Day_4;

public class privatespecifier {
	private void add() {
		System.out.println("hello");
	}

public class testthis extends privatespecifier{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testthis t1=new testthis();
		t1.add();//we are trying to access by another class 	
	}
}




