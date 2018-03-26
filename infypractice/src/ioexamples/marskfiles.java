package ioexamples;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class marskfiles {
	
	public static void main(String[] args) throws IOException {
		
	
	Reader fit1=null;
	Reader fit2=null;
	Writer fio=null;
 try {
	 fit1=new FileReader("C:\\Users\\p731296\\eclipse-workspace\\infypractice\\src\\JohnTerm1.txt");
	 fit2=new FileReader("C:\\Users\\p731296\\eclipse-workspace\\infypractice\\src\\JohnTerm2.txt");
	 fio=new FileWriter("C:\\Users\\p731296\\eclipse-workspace\\infypractice\\src\\johnsum.txt");
	 
	 int i=fit1.read();
	 while(i !=-1)
	 {
		 System.out.println((char)i);
		 
		 i=fit1.read();
	 }
	 
	 
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


}
	
}
