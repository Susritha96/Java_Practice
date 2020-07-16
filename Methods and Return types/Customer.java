class Restaurant{
void menu(){
System.out.println("1.IDLY 2. DOSA 3.VADA");
}
void takeOrder(String order1){
System.out.println("Order given is "+order1);
}
String serveFood(){
return "Idly";
}
String payBill(int amount){
System.out.println("Amount given is "+amount);
return "paid";
}
}
class Customer{
public static void main(String args[]){
Restaurant ohris = new Restaurant();
ohris.menu();
ohris.takeOrder("IDLY");
System.out.println("Food served is :"+ohris.serveFood());
System.out.println("Bill "+ohris.payBill(100));
}
}