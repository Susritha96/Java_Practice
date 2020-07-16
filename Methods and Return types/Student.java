class College{
void listOfDep(){
System.out.println("1.JNTUH 2.KU 3.AU 4.KITS");
}
void university(String university){
System.out.println("University Selected"+university);
}
String universitySel(){
return "JNTUH";
}
String payBill(int amount){
System.out.println("Given college fee is "+amount);
return "paid";
}
}
class Student{
public static void main(String args[]){
College susritha = new College();
susritha.listOfDep();
susritha.university("JNTUH");
System.out.println("College Selected :"+susritha.universitySel());
System.out.println("Fee "+susritha.payBill(200000));
}
}