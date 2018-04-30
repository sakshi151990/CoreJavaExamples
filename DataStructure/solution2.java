import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

 

class Studente {
   private int id;
   private String fname;
   private double cgpa;
   public Studente(int id, String fname, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
 
}
   
   public static Comparator<Studente> cmp=new Comparator<Studente>() {

	

		public int compare(Studente arg0, Studente arg1) {
			
			if(arg1.getCgpa() == arg0.getCgpa())
		    {  if(arg1.getFname().equals(arg0.getFname()))
		        return arg1.getId()-arg0.getId();
		     else
				return arg1.getFname().compareTo(arg0.getFname());}
		
			else{ if(arg1.getCgpa() > arg0.getCgpa())
		            return 1;
		        else
		         return   -1;}
			
		
		}
		
	};

}

//Complete the code
public class solution2
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      
      List<Studente> studentList = new ArrayList<Studente>();
      while(testCases>0){
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();
         
         Studente st = new Studente(id, fname, cgpa);
         studentList.add(st);
         
         testCases--;
      }
      
    
     Collections.sort(studentList,Studente.cmp);
      
     for(Studente st: studentList){
         System.out.println(st.getFname()+""+st.getId()+""+st.getCgpa());
     
     } }
   }

