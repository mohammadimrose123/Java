package Day_3;

public class stringbuffer {
	public static void main(String args[]) {
		String s1="listen";
		String s2="silent";
		StringBuffer sb=new StringBuffer(s1);
		StringBuffer sb1=new StringBuffer(s2);
		System.out.println(sb.append(sb1));
	}

}
