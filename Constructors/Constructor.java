class Student{
int id;
float percentage;
Student(int id , float percentage){
this.id=id;
this.percentage = percentage;
}
void display(){
System.out.println("id"+id);
System.out.println("percentage = "+percentage);
}
}
class Constructor{
public static void main(String args[]){
Student rahul = new Student(1023,65.34f);
rahul.display();
Student shiva = new Student(1024,87.34f);
shiva.display();

}
}