package Day_5;
class Animal{
	void sleep() {                                       //single inheritance
		System.out.println("Dog is sleeping");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Dog is Barking");
	}
}
public class SI {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1=new Dog();
		d1.sleep();
		d1.bark();

	}

}
