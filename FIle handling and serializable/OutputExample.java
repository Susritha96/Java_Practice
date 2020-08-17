import java.io.*;
class OutputExample{
public static void main(String args[]) throws Exception{
FileOutputStream fo = new FileOutputStream("C:\\Users\\susritha gade\\Desktop\\output\\example.txt");
String s ="Welcome to files concept";
byte[] x = s.getBytes();
fo.write(x);
fo.close();

}
}