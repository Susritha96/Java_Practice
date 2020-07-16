class Student{
int id;
float percentage;
static String clg;
static int clg_pincode;
}
class Employee{
int empid;
float salary;
static String company;
}
class VariableDemo{
public static void main(String args[]){
Student rahul=new Student();
rahul.id=1023;
rahul.percentage = 56.7f;
Student.clg="TKR";
Student.clg_pincode=50062;
System.out.println("=========== Student Details ========= ");
System.out.println("id = "+rahul.id);
System.out.println("percentage = "+rahul.percentage);
System.out.println("college = "+Student.clg);
System.out.println("clg pincode = "+Student.clg_pincode);


Employee shiva = new Employee();
shiva.empid=101;
shiva.salary=50000.0f;
Employee.company = "Infosys";
System.out.println("=========== Employee Details ========= ");
System.out.println("Employee id = "+shiva.empid);
System.out.println("Salary = "+shiva.salary);
System.out.println("company = "+Employee.company);
}
}