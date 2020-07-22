class Theater{
void bookTicket(String ticket){
System.out.println("Movie booked"+ticket);
}
void bookTicket(String ticket1,String ticket2){
System.out.println("Movies booked"+ticket1+","+ticket2);
}
void bookTicket(String ticket1,String ticket2,String ticket3){
System.out.println("Movies booked"+ticket1+", "+ticket2+", "+ticket3);
}

}
class User{
public static void main(String args[]){
Theater cinemax = new Theater();
cinemax.bookTicket("Bagamathi");
cinemax.bookTicket("Bagamathi","Arundathi");
cinemax.bookTicket("Bagamathi","Arundathi","Baahubali");

}
}