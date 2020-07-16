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
suresh.docid=2002;
suresh.salary = 200000.0f;
Doctor.hospital="Yashoda";
System.out.println("============= Doctor Details =============");
System.out.println("Doctor id "+ suresh.docid);
System.out.println("salary "+ suresh.salary);
System.out.println("Hospital"+Doctor.hospital);
Patient sujay = new Patient();
sujay.patid = 303;
sujay.disease ="cancer";
Patient.hospital="Yashoda";
System.out.println("============= Patient Details =============");
System.out.println("Patient id "+ sujay.patid);
System.out.println("salary "+ sujay.disease);
System.out.println("Hospital"+Patient.hospital);

}
}