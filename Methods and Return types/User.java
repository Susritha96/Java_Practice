class Theater{
void listOfMovies(){
System.out.println("1.Arundathi 2.Bahubali 3.Bagamathi");
}
void bookTicket(String ticket){
System.out.println("Movie booked"+ticket);
}
String ticket(){
return "Bagamathi";
}
String payBill(int amount){
System.out.println("Amount given is "+amount);
return "paid";
}
}
class User{
public static void main(String args[]){
Theater cinemax = new Theater();
cinemax.listOfMovies();
cinemax.bookTicket("Bagamathi");
System.out.println("Food served is :"+cinemax.ticket());
System.out.println("Bill "+cinemax.payBill(200));
}
}