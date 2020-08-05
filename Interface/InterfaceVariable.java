interface Parent{
int age = 54;
}
interface Child{
int age = 20;
}
class AgeDetails implements Parent,Child{
void display(){
System.out.println("Parent age is "+	Parent.age);
System.out.println("Child age is "+Child.age);
}
}
class InterfaceVariable{
public static void main(String args[]){
AgeDetails a = new AgeDetails();
a.display();
}
}
