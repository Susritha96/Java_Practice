import java.io.*;
class FileReaderEx{
public static void main(String args[]) throws Exception{
FileReader fr = new FileReader("C:\\Users\\susritha gade\\Desktop\\output\\example2.txt");
int i = fr.read();
while(i!=-1){
System.out.print((char)i);
i = fr.read();
}
fr.close();
}
}