interface Vehicle{
void cost();
void mileage();
}
abstract class Car implements Vehicle{
void vipers(){
System.out.println("Vipers to clean the window");
}
}
abstract class Bike implements Vehicle{
void stand(){
System.out.println("Stand to support the bike");
}
}
class Audi extends Car{
public void cost(){
System.out.println("Audi car is 50lakhs");
}
public void mileage(){
System.out.println("Audi mileage is 15kms");
}
}
class Fz extends Bike{
public void cost(){
System.out.println("Fz cost is 1 lakh");
}
public void mileage(){
System.out.println("Fz mileage is 45kms");
}
}
class InterfaceDemo{
public static void main(String args[]){
Car x = new Audi();
x.vipers();
x.cost();
x.mileage();
Bike b = new Fz();
b.stand();
b.cost();
b.mileage();
}
}