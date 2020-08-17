import java.io.*;
class Student implements Serializable{
int id,marks;
String name;
public Student(int id, String name,int marks){
this.id=id;
this.name = name;
this.marks = marks;
}
}
class DemoSerializable{
public static void main(String args[])throws Exception{
FileOutputStream fo = new FileOutputStream("C:\\Users\\susritha gade\\Desktop\\output\\demoser.txt");
ObjectOutputStream op = new ObjectOutputStream(fo);
Student rahul = new Student(1023,"rahul kumar",563);
op.writeObject(rahul);
op.close();
}
}