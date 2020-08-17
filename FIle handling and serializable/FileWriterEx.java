import java.io.*;
class FileWriterEx{
public static void main(String args[]) throws Exception{
FileWriter fw = new FileWriter("C:\\Users\\susritha gade\\Desktop\\output\\example2.txt");
fw.write("Welcome to jnit");
fw.close();
}
}