class Car{
void cost(){
System.out.println("No cost");
}
void mileage(){
System.out.println("No mileage");
}
}

class Audi extends Car{
void cost(){
System.out.println("Cost of audi is 50 lakhs");
}
void mileage(){
System.out.println("Milage of audi is 15 km");
}
}
class Bmw extends Car{
void cost(){
System.out.println("cost of bmw is 40 lakhs");
}
void mileage(){
System.out.println("Mileage of bmw is 10 km");
}
}
class MethodOverridding{
public static void main(String args[]){
Car x = new Car();
x.cost();
x.mileage();
x= new Audi();
x.cost();
x.mileage();
x= new Bmw();
x.cost();
x.mileage();
}
}