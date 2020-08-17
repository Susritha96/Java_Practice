class Car{
void start(){
System.out.println("Starts with a key");
}
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
class CarFactory{
static Car getCar(String carName){
if(carName.equals("Audi"))
return new Audi();
else if (carName.equals("BMW"))
return new Bmw();
else
return null;
}
}
class MethodOverriddingFactory{
public static void main(String args[]){
Car x = CarFactory.getCar(args[0]);
x.start();
x.cost();
x.mileage();


}
}