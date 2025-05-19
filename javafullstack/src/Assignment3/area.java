package Assignment3;
import java.util.Scanner;
class Rectangle{
 private int length;
 private int breadth;
 public void setArea(int l,int b) {
	 length=l;
	 breadth=b;
	 
 }
 public int getArea() {
	 return length*breadth;
 }
	
}
 public class area {
	
public static void main(String[] args) {
	Rectangle a=new Rectangle();
	Scanner in=new Scanner(System.in);
	System.out.print("Length: ");
	int length=in.nextInt();
	
	System.out.print("Breadth: ");
	int breadth=in.nextInt();
	a.setArea(length,breadth);
	System.out.println("Area: "+a.getArea());
	in.close();
	
}
}
