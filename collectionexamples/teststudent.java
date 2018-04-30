package cololectionexamples;
import java.util.*;

public class teststudent {
	
	public static void main(String[] args) {
		
		Set<Student>  set=new TreeSet<>(new studentcomparator());
		
		set.add(new Student("sakgfh", 6));
		set.add(new Student("sakshi",2));
		set.add(new Student("sakt", 3));
		set.add(new Student("john",5));
		
		List<Student> list=new ArrayList(set);
		
		//Collections.sort(list);
		
		Iterator<Student> it=list.iterator();
		
		while (it.hasNext()) {
			Student student = (Student) it.next();
			System.out.println(student.getName()+student.getRollno());
			
		}

	}

}
