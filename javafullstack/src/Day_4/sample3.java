//public specifier
package Day_4;
 class sample2 {
	public void add() {
		 System.out.println("hello");
	 }
 }


 public class sample3 extends sample2{
	 public static void main(String[] args) {
		 sample3 s1=new sample3();
		 s1.add();
	 }
}
 //private access specifier

// package Day_4;
// class sample23 {
//	  private void add() {
//		 System.out.println("hello");
//	 }
// }
// public class sample3 extends sample23{
//	 public static void main(String[] args) {
//		 sample3 s1=new sample3();
//		 s1.add();
//	 }
//}
//protected specifier
//package Day_4;
//public class sample23 {
//	  protected void add() {
//		 System.out.println("hello");
//	 }
// }
// public class sample3 extends sample23{
//	 public static void main(String[] args) {
//		 sample3 s1=new sample3();
//		 s1.add();
//	 }
//}

 // default specifier
// package Day_4;
// class sample23 {
//	 void add() {
//		 System.out.println("hello");
//	 }
// }
// public class sample3 extends sample23{
//	 public static void main(String[] args) {
//		 sample3 s1=new sample3();
//		 s1.add();
//	 }
//
//}