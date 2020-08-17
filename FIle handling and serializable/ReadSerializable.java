import java.io.*;
class ReadSerializable{
public static void main(String args[])throws Exception{
FileInputStream fi = new FileInputStream("C:\\Users\\susritha gade\\Desktop\\output\\demoser.txt");
ObjectInputStream oi = new ObjectInputStream(fi);
Object o = oi.readObject();
Student rahul = (Student)o;
System.out.println(rahul.id+" "+rahul.name+" "+rahul.marks);
}
}
