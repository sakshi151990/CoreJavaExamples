package staticex;

public class testloan {
	public static void main(String ar[])
	{
		Loan l1=Loan.getLoanInstance();
		/*Loan l2=new Loan(34602640,7423908,6575,3,67);
		Loan l3=new Loan();
		Loan l4=new Loan(34602640,7423908,6575,3,67);
		Loan l5=new Loan();
		Loan l6=new Loan(34602640,7423908,6575,3,67);
		*/
		System.out.println(l1.getNoOfobjects());
	}
}
