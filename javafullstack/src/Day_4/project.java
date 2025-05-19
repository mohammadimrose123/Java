package Day_4;
public class project {
	private String firstName;
	private String lastName;
	private String emailId;
	private long phoneNumber;
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
	public void setEmailId(String mail) {
		emailId=mail;
			
	}
public String getEmailId() {
	return emailId;
}
public void setPhoneNumber(long ph) {
	phoneNumber=ph;
	
}
public long getPhoneNumber() {
	return phoneNumber;
}
public static void main(String[]args) {
	project p=new project();
	p.setFirstName("Mohammad");
	p.setLastName("Imrose");
	p.setEmailId("mohammadimrose09@gmail.com");
	p.setPhoneNumber(6281402165l);
	System.out.println("First name: "+p.getFirstName());
	System.out.println("Last name: "+p.getLastName());
	System.out.println("Email id: "+p.getEmailId());
	System.out.println("Phone number: "+p.getPhoneNumber());
}
}
