import java.util.Scanner;
class Divide{
void div(int x ,float y){
System.out.println("Integer sum = "+(x/y));
}
void div(float x,float y){
System.out.println("Decimal sum = "+(x/y));
}
}
class Division{
public static void main(String args[]){
Divide x = new Divide();
Scanner sc = new Scanner(System.in);
System.out.println("Enter a,b values");
int a = sc.nextInt();
float b = sc.nextFloat();
x.div(a,b);
}
}