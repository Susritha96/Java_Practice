import java.io.*;
class InputExample{
public static void main(String args[]) throws Exception{
FileInputStream fo = new FileInputStream("C:\\Users\\susritha gade\\Desktop\\output\\example.txt");
int x = fo.read();
while(x!=-1){
System.out.print((char)x);
x=fo.read();
}

fo.close();
}
}