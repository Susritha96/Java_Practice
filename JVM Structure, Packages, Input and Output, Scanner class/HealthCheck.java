import java.util.Scanner;
class Doctor{
int docid;
float salary;
static String hospital;
}
class Patient{
int patid;
String disease;
static String hospital;
}
class HealthCheck{
public static void main(String args[]){
Doctor suresh = new Doctor();
Scanner sc = new Scanner(System.in);
System.out.println("Enter Doctor details");
suresh.docid=sc.nextInt();
suresh.salary = sc.nextFloat();
Doctor.hospital=sc.next();
Patient sujay = new Patient();
Scanner sc1 = new Scanner(System.in);
System.out.println("Enter Patient Details");
sujay.patid = sc1.nextInt();
sujay.disease =sc1.next();
Patient.hospital= sc1.next();
System.out.println("============= Doctor Details =============");
System.out.println("Doctor id "+ suresh.docid);
System.out.println("salary "+ suresh.salary);
System.out.println("Hospital"+Doctor.hospital);
System.out.println("============= Patient Details =============");
System.out.println("Patient id "+ sujay.patid);
System.out.println("salary "+ sujay.disease);
System.out.println("Hospital"+Patient.hospital);

}
}