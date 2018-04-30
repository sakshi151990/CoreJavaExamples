import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


class Student{
	
	private String name;
	private int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}


public class equalandhashcodeexample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student("John", 15);
		Student s2=new Student("John", 15);
		
		Set<Student> set=new HashSet<Student>();
		set.add(new Student("sam" ,16));
		set.add(new Student("sam", 16));
		System.out.println("Hash value");
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		//System.out.println(System.identityHashCode(set.get(1)));
		//System.out.println(System.identityHashCode(set.get(0)));
		
	System.out.println(set);
		
		System.out.println(s1.equals(s2));
		String some = "some string";
		String other = new String("some string");
		boolean equal = some == other;
		System.out.println(equal);
		System.out.println(some.equals(other));

	}

}
