package infypractice;

public class PermanentEmployee extends Employee {

	
	private double basicpay;
	private double hra;
	private int experience;
	public double getBasicpay() {
		return basicpay;
	}
	public void setBasicpay(double basicpay) {
		this.basicpay = basicpay;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public void calculateSalary()
	{ double varaibleComponent=0;
	
	if (experience < 3)
		varaibleComponent=0;
	else if(experience >=3 && experience <5 )
		varaibleComponent=(5/100)*basicpay;
	else if(experience >=5 && experience <10 )
		varaibleComponent=(7/100)*basicpay;
	else
		
varaibleComponent=(12/100)*basicpay;
	
	salary=varaibleComponent+basicpay+hra;
	
	}
}
