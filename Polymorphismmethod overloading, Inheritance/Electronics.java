import java.util.Scanner;
class Mobile{
String a;
Scanner sc = new Scanner(System.in);
void charger(){
System.out.println("Enter a mobile phone charger");
a=sc.next();
}
void mobile(){
System.out.println("Mobile charger entered is : "+a);
}

}
class Oppo extends Mobile{
String b;

void accept(){
System.out.println("Enter features");
b=sc.next();
}
void features(){
System.out.println("Oppo mobile charger type " +a+" and special features are "+b );
}
}
class Electronics{
public static void main(String args[]){
Oppo x = new Oppo();
x.charger();
x.mobile();
x.accept();
x.features();
}
}
