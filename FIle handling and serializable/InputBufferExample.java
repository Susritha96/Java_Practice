import java.io.*;
class InputBufferExample{
public static void main(String args[]) throws Exception{
FileInputStream fo = new FileInputStream("C:\\Users\\susritha gade\\Desktop\\output\\example.txt");
BufferedInputStream bi = new BufferedInputStream(fo);
int x = bi.read();
while(x!=-1){
System.out.print((char)x);
x=bi.read();
}
bi.close();
fo.close();
}
}