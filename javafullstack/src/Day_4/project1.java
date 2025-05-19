package Day_4;
class profile{
	float ssc;
	int inter;
	float btech;
	public profile() {
		System.out.println("Welcome to my profile:mohammadimrose");
	}
	public profile(float ssc) {
		this.ssc=ssc;
		System.out.println("ssc marks: "+ssc);
	}
	public profile(float ssc,int inter) {
		this.ssc=ssc;
		this.inter=inter;
		System.out.println("ssc marks and inter marks: "+(ssc)+" "+(inter));
		
	}
	public profile(float ssc, int inter,float btech) {
		this.ssc=ssc;
		this.inter=inter;
		this.btech=btech;
		System.out.println("ssc marks&intermarks and btechmarks: "+(ssc)+" "+(inter)+" "+(btech));
	}
}

public class project1 {
	public static void main(String[]args) {
		profile p=new profile();
		profile p1=new profile(10f);
		profile p2=new profile(10f,958);
		profile p3=new profile(10f,958,8.23f);
		
	}

}
