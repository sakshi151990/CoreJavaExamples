package infypractice;

public class ContractEmployee extends Employee{

	private int hrs;
	private double wages;
	public int getHrs() {
		return hrs;
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	public double getWages() {
		return wages;
	}
	public void setWages(double wages) {
		this.wages = wages;
	}
	
	public void calculateSalary()
	{
	salary=hrs*wages;

	
	}
	
}
