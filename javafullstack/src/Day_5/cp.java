package Day_5;

public class cp {
void show() {           //compiletime polymorphism
	System.out.println("Good Morning");
}
void show(int a,int b) {
	System.out.println("Addition:"+(a+b));
}
void show(double d1,double d2) {
	System.out.println("Subtraction:" + (d1-d2));
}
void show(String s1,String s2) {
	System.out.println("name:"+s1+s2);
}
public static void main(String[] args) {
	cp h1=new cp();
	h1.show();
	h1.show(2,4);
	h1.show(3d,5d);
	h1.show("hello","world");
}

}
