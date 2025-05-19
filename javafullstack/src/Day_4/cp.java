package Day_4;
//copy constructor
 class h{
	 int x;
	 int y;
	 public h(int x,int y) {
		 this.x=x;
		 this.y=y;
		 System.out.println(x+y);			
	 }
	 public h(h t1) {
		 this.x=t1.x;
		 this.y=t1.y;
		 System.out.println(x-y);
	 }
 }
	 public class cp{
		 public static void main(String[] args){
	h t1=new h(45,23);
	h t2=new h(t1);
			 
	 }
}
