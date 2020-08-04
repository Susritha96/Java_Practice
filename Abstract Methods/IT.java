abstract class Company{
	abstract void Salary(float sal);
	void companyAddress(String addr){
		System.out.println("Company addr is "+ addr);
	}
	
}
class Manager extends Company{
	void Salary(float sal){
		System.out.println("Salary of a manager is: "+ sal);
	}
}
class Employee extends Company{
	
	void Salary(float sal){
		System.out.println("Salary of an employee: "+sal);
	}
}
class IT{
	public static void main(String args[]){
		Employee emp = new Employee();
		emp.companyAddress("700 E Ash");
		emp.Salary(1234.56f);
		Manager man =new Manager();
                man.companyAddress("700 E Ash");
		man.Salary(1234.56f);
	}
}