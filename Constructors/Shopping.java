class 	Malls{
String stores;
int employees;
Malls(String stores , int employees){
this.stores=stores;
this.employees = employees;
}
void display(){
System.out.println("Name of the store is "+stores);
System.out.println("Number of employees in the store = "+employees);
}
}
class Shopping{
public static void main(String args[]){
Malls mall1 = new Malls("Sephora",20);
mall1.display();
Malls mall2 = new Malls("Nike",15);
mall2.display();

}
}