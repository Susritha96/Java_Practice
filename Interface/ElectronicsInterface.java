interface Electronics{
void cost();
void battery();
}
abstract class Mobile implements Electronics{
void notifications(){
System.out.println("Notifications are displayed on top of the phone");
}
}
abstract class Laptop implements Electronics{
void keyboard(){
System.out.println("Keyboard is used for typing");
}
}
class Oppo extends Mobile{
public void cost(){
System.out.println("Cost of oppo phone is 20k");
}
public void battery(){
System.out.println("Battery of oppo phone 5000 maH");
}
}
class Iphone extends Mobile{
public void cost(){
System.out.println("Cost of iphone 11  is 70k");
}
public void battery(){
System.out.println("Battery of iphone 11 is 4000 maH");
}
}
class Dell extends Laptop{
public void cost(){
System.out.println("Cost of dell laptop is 40k");
}
public void battery(){
System.out.println("Battery of dell laptop is 4800 maH");
}
}
class Mac extends Laptop{
public void cost(){
System.out.println("Cost of Mac is 80k");
}
public void battery(){
System.out.println("Battery of Mac 43800 maH");
}
}

class ElectronicsInterface{
public static void main(String args[]){
Oppo x = new Oppo();
x.notifications();
x.cost();
x.battery();
Iphone y = new Iphone();
y.notifications();
y.cost();
y.battery();
Dell z = new Dell();
z.keyboard();
z.cost();
z.battery();
Mac i = new Mac();
i.keyboard();
i.cost();
i.battery();
}
}