package Day6;
//libraryClass
class Demo{
	void show() {
		System.out.println("Hello World");
	}
}
//AnynomousInneClass 
public class AnynomousInner {
	Demo d=new Demo() { //Access the libraryClass by creating object for the Demo
		void show() {
			System.out.println("Hello Users");
			super.show();
		}
	};
	public static void main(String[] args) {
		AnynomousInner ai=new AnynomousInner();
		ai.d.show();//AnynomousClass.librarClass.methodofAnynomousClass
		
		
	}
}
