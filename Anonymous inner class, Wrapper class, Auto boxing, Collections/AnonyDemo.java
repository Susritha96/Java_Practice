abstract class Person{
abstract void eat();
}

class AnonyDemo{
public static void main(String args[]){
Person rahul = new Person(){
void eat(){
System.out.println("Eating ice cream");
}
};
rahul.eat();
}
}