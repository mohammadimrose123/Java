package Day6;
//posible
public class finalkeyword{
	void show() {
		int a=23;
		System.out.println(a);
		a=34;
		System.out.println(a);
	}
	public static void main(String[] args) {
		finalkeyword f1=new finalkeyword();
		f1.show();
				
	}
}
//Not possible 
//public class finalkeyword {
//	void show() {
//		final int a=23;
//		System.out.println(a);
//		a=34;
//		System.out.println(a);
//	}
//public static void main(String[] args) {
//	finalkeyword f1=new finalkeyword();
//	f1.show();
//}
//}
