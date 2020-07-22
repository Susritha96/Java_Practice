import java.util.Scanner;
class Mul{
void mul(float x ,int y){
System.out.println("Integer sum = "+(x*y));
}
void mul(float x,float y){
System.out.println("Decimal sum = "+(x*y));
}
}
class Multiplication{
public static void main(String args[]){
Mul x = new Mul();
Scanner sc = new Scanner(System.in);
System.out.println("Enter a,b values");
float a = sc.nextFloat();
int b = sc.nextInt();
x.mul(a,b);
}
}