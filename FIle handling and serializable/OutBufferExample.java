import java.io.*;
class OutBufferExample{
public static void main(String args[]) throws Exception{
FileOutputStream fo = new FileOutputStream("C:\\Users\\susritha gade\\Desktop\\output\\example1.txt");
BufferedOutputStream bo = new BufferedOutputStream(fo);

String s ="Welcome to files concept";
byte[] x = s.getBytes();
bo.write(x);
bo.flush();
bo.close();
fo.close();
}
}