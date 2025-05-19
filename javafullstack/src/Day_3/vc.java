package Day_3;
//import java.util.Scanner;
public class vc {
	public static void main(String args[]) {
		
	
		String str="Helloworld";
		
		String vowels="",consonants="";
		for(int i=0;i<str.length();i++) {
		
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'|| ch=='o'||ch=='u') { vowels+=ch;
			}
			else if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z') {
				consonants+=ch;
			}
			}
		System.out.println("vowels:"+vowels+",Consonants:"+consonants);
			
		}
	}
	


