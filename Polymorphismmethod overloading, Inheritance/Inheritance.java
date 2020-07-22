import java.util.Scanner;
class Square{
int a;
Scanner sc = new Scanner(System.in);
void input(){
System.out.println("Enter a value");
a=sc.nextInt();
}
void sqr(){
System.out.println("Square"+(a*a));
}

}
class Sum extends Square{
int b;

void accept(){
System.out.println("Enter b value");
b=sc.nextInt();
}
void add(){
System.out.println("Sum = "+(a+b));
}
}
class Inheritance{
public static void main(String args[]){
Sum x = new Sum();
x.input();
x.sqr();
x.accept();
x.add();
}
}
