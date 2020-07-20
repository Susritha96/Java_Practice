import java.util.Scanner;
class Student{
int id;
float percentage;
static String clg;
static int clg_pincode;
}
class VariableDemo{
public static void main(String args[]){
Student rahul = new Student();
Scanner sc = new Scanner(System.in);
System.out.println("Enter Student Details");
rahul.id=sc.nextInt();
rahul.percentage=sc.nextFloat();
rahul.clg=sc.next();
rahul.clg_pincode=sc.nextInt();
System.out.println("=============Student Details ================");
System.out.println("id ="+rahul.id);
System.out.println("percentage="+rahul.percentage);
System.out.println("college="+rahul.clg);
System.out.println("pincode="+rahul.clg_pincode);
}
}