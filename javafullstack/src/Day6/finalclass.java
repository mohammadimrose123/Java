package Day6;
//final class
//final class test{
//	void show() {
//		int a=2;
//		int b=3;
//		System.out.println("ADDITION");
//}
//}
//public class finalclass extends test {
//	 void show() {
//		int a=2;
//		int b=3;
//		System.out.println(a);
//		System.out.println(b);
//	}
//	public static void main(String[] args) {
//		finalclass fc=new finalclass();
//		fc.show();
//}
//
//}
////final cannot access in another package
 class test{
	void show() {
		int a=2;
		int b=3;
		System.out.println("ADDITION");
}
}
public class finalclass extends test {
	 final void show() {
		int a=2;
		int b=3;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		finalclass fc=new finalclass();
		fc.show();
}

}
