class Fruits{
void color(){
System.out.println("Fruits are in various colors");
}
void taste(){
System.out.println("Fruits are in various tastes");
}
}
class Apple extends Fruits{
void color(){
System.out.println("Apple is red in color");
}
void taste(){
System.out.println("Apple is a little sour and bitter, but mostly sweet,");
}

}
class Banana extends Fruits{
void color(){
System.out.println("Banana is yelow in color");
}
void taste(){
System.out.println("Banana is sweet in taste");
}
}

class FruitsOverriding{
public static void main(String args[]){
Fruits x = new Fruits();
x.color();
x.taste();
x = new Apple();
x.color();
x.taste();
x = new Banana();
x.color();
x.taste();
}
}