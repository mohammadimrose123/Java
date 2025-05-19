package Day6;
//MethodInnerClass Example
public class MethodInnerClass {  //OuterClass
	void show() { //outer class method
		System.out.println("ASSALAMUWALIKUM MUSTAFA BHAI");
		class Test{ //inner class inside the method
			void print() {
				System.out.println("WALIKUMUSALAM IMROSE BHAI");
			}
				
			}
		Test t1=new Test(); //creating object for InnerClass Method
		t1.print();
		}
	public static void main(String[] args) {
		MethodInnerClass mic=new MethodInnerClass(); // creating object for OuterClass Method
		mic.show();
	}

}
