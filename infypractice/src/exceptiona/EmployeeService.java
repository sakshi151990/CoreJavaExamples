package exceptiona;

public class EmployeeService {

	public static void main(String[] args) throws EmpSalaryException {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee("john", 10, 2345.56);
		Employee e2=new Employee("john", 10, 12890);
		Employee e3=new Employee("john", 10, 34.56);
		Employee e4=new Employee("john", 10, 2345.56);

		try {
			EmployeeService.checkEmployeeService(e1);
		
		EmployeeService.checkEmployeeService(e2);
		EmployeeService.checkEmployeeService(e3);
	
		} catch (EmpSalaryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		EmployeeService.checkEmployeeService(e4);
	}
	
	public static void checkEmployeeService(Employee emp) throws EmpSalaryException
	{
		if(emp.getEmpSalary() < 1000)
			
				throw new EmpSalaryException("salay exception");
		else 
			System.out.println(emp.getEmpSalary());
	}

}
