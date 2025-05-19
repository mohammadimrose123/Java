package Day_5;
class Movies{
	void genre() {
		System.out.println("Crime and Murder");
	}
}
class Hit extends Movies{
	void action() {
		System.out.println("Investigation");
	}
}
class Hero extends Hit{
	void name() {
		System.out.println("Nani performace is excellect");
	}
}
class Heroine extends Hero{
	void acting() {
		System.out.println("srinidhi acting is natural and good");
	}
}
public class HI {
	public static void main(String[] args) {
		Hero h1=new Hero();
		Heroine h2=new Heroine();
		h1.action();
		h1.genre();
		h1.name();
		h2.acting();
		
	}

}
