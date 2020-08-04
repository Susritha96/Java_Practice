class Animal{
void move(){
System.out.println("Animals walk");
}
void eat(){
System.out.println("Animals eat food ");
}
}
class Dog extends Animal{
void move(){
System.out.println("Dog walk with medium speed and runs fast");
}
void eat(){
System.out.println("Dog eat meat and vegetables");
}
}
class Tiger extends Animal{
void move(){
System.out.println("Tiger walks slowly and runs fast");
}
void eat(){
System.out.println("Tiger eats meat only");
}
}

class AnimalOverriding{
public static void main(String args[]){

Animal x = new Animal();
x.move();
x.eat();
x=new Dog();
x.move();
x.eat();
x=new Tiger();
x.move();
x.eat();
}
}
