package infypractice;

public class EmploeeRecord {
	
	public static void main (String args[])
	
	{
		ContractEmployee ce=new ContractEmployee();
		PermanentEmployee pe=new PermanentEmployee();
		ce.setName("Anikit");
		ce.setEmpid(102);
		ce.setWages(500);
		ce.setHrs(10);
		ce.calculateSalary();
		System.out.println("Contract Employee: " + ce.getSalary());
		
		pe.setName("Anil");
		pe.setEmpid(101);
		pe.setExperience(3);
		pe.setBasicpay(10000);
		pe.setHra(1500);
		pe.calculateSalary();
		System.out.println("Permanent Employee: " + pe.getSalary());
	}

}
