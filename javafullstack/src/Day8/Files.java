package Day8;
import java.io.*;
import java.util.Scanner;
public class Files {
	// creating a file on the desktop
//	public static void main(String[] args)throws IOException{
//		File fp=new File("C:\\Users\\Welcome\\OneDrive\\Desktop\\imrose.txt");
//		if(fp.createNewFile()) {
//			System.out.println("File is Created Succussfully please check at Desktop");
//		}else {
//			System.out.println("File is Already Exists please Rename with another Name");
//		}
//	}
//}
//--------------------------------------------
	//*****Writing Text into the File********
//	public static void main(String[] args)throws IOException{
//		FileWriter f1=new FileWriter("C:\\Users\\Welcome\\OneDrive\\Desktop\\imrose.txt");
//		f1.write("Hi Virat How are you");
//		f1.close();
//		System.out.println("Successful");
//	}
//}
//------------------------------------------------------
	//*******creating to files *********
public static void main(String[] args) {
	try {
		File fp=new File("C:\\Users\\Welcome\\OneDrive\\Desktop\\imrose.txt");
		Scanner R=new Scanner(fp);
	    while(R.hasNextLine()) {
	    	String data=R.nextLine();
	    	System.out.println(data);
	    }
	    R.close();
	} 
	catch(FileNotFoundException e) {
		System.out.println("An error has occurred");
		e.printStackTrace();
	}
}
}
//******** Scussfully completed ***************