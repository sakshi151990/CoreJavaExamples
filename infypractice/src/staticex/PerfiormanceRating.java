package staticex;

public class PerfiormanceRating {

	private static int outstanding=5;
	private static int good=4;
	private int average=3;
	private static int poor=2;
	
	
	
	



	public static int calculatePerformance(int point)
	{
		if(point > 80 && point <= 100)
			return outstanding ;
		else if(point > 60 && point < 80)
			return good;
		else return poor;
	}

	public static void main (String args[])
	{
		Employee e1=new Employee(100);
		Employee e2=new Employee(70);
		Employee e3=new Employee(60);
		
		System.out.println(new PerfiormanceRating().calculatePerformance(e1.getPoint()));
	}
}
