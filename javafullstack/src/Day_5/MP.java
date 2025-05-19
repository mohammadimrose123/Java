package Day_5;
class Fruits{
	void benifits() {
		System.out.println("healthy");
	}
}
class Apple extends Fruits{
	void color() {
		System.out.println("Apple is red color");
	}
}
class Banana extends  Fruits{
	void taste() {                                                       //multi path
		System.out.println("Banana is sweet and contains protiens");
	}
}
class Mango extends Fruits{
	void price() {
		System.out.println("Mango is seasonal fruit and 100 per kg , contains rich carbohydrates");
	}
}

public class MP {
	public static void main(String[] args) {
		Apple a1=new Apple();
		a1.color();
		Banana b1=new Banana();
		b1.taste();
		Mango m1=new Mango();
		m1.price();
	}

}
