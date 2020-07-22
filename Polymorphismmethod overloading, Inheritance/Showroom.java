import java.util.Scanner;
class Car{
String a;
Scanner sc = new Scanner(System.in);
void input(){
System.out.println("Enter a car name ");
a=sc.next();
}
void start(){
System.out.println("Car name enter is "+ a);
}

}
class Bmw extends Car {
String b;

void accept(){
System.out.println("Enter car features");
b=sc.next();
}
void audiFeature(){
System.out.println(a+" car special features are " + b);
}
}
class Showroom{
public static void main(String args[]){
Bmw x = new Bmw();
x.input();
x.start();
x.accept();
x.audiFeature();
}
}