package Day_4;
public class encp {
	private String firstName;
	private String lastName;
	public void setFirstName(String fn) {
		firstName=fn;
	}
	public void setLastName(String ln) {
		lastName=ln;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public static void main(String[]args) {
		encp e=new encp();
		e.setFirstName("Mohammad");
		e.setLastName("Imorse");
		System.out.println(e.getFirstName());
		System.out.println(e.getLastName());
		
	}

}
