package cololectionexamples;

import java.util.Comparator;

public class studentcomparator implements Comparator<Student>  {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getRollno()-o2.getRollno();
	}

}
