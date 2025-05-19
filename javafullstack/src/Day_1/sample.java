package Day_1;

public class sample {
int x=67,y=89;
static int p=45,q=12;
void quotient() {
	int a=100,b=50;
	System.out.println(a/b);
}
void remainder() {
	System.out.println(x%y);
}
void mul() {
	System.out.println(p*q);
		
	}
public static void main(String[] args) {
	sample s1=new sample();
	s1.quotient();
	s1.remainder();
	s1.mul();
}

}
