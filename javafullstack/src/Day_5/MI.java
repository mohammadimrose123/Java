package Day_5;
 class Bike{
	 void speed() {
		 System.out.println("250 km per hour");
	 }
 }
 class BMW extends Bike{
	 void rev() {
		 System.out.println("1000cc");                    //multilevel inheritance
	 }
 }
 class Model extends BMW{
	 void price() {
		 System.out.println("30 lakhs");
	 }
 }
public class MI {
	public static void main(String[] args) {
		Model m1=new Model();
		m1.speed();
		m1.rev();
		m1.price();
	}
	

}
