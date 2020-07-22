class Restaurant{
void takeOrder(String order1){
System.out.println("Order given is a "+order1);
}
void takeOrder(String order1,String order2){
System.out.println("Order given is "+order1+"and "+order2);
}
void takeOrder(String order1,String order2,String order3){
System.out.println("Order given is "+order1+", "+order2+"and "+order3);
}


}
class Customer{
public static void main(String args[]){
Restaurant ohris = new Restaurant();
ohris.takeOrder("IDLY");
ohris.takeOrder("IDLY","VADA");
ohris.takeOrder("IDLY","VADA","DOSA");

}
}