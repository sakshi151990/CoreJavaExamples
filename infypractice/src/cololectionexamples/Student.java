package cololectionexamples;

public class Student implements Comparable<Student>{

	private String name;
	private int rollno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public Student(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollno;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
	
		if (obj == null)
			return false;
			Student other = (Student) obj;
		if (rollno != other.rollno)
			return false;
		return true;
	}
	@Override
	public int compareTo(Student o) {
	
		return this.name.compareTo(o.getName());
		
		
	}
	
	
}
