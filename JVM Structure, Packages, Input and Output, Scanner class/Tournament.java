import java.util.Scanner;
class Sport{
String sport;
static String tournament; 
int sportid;
}
class Player{
int playerid;
String name;
static String tournament;
}
class Tournament{
public static void main(String args[]){
Sport cricket = new Sport();
Scanner sc = new Scanner(System.in);
System.out.println("Enter sport Details");
cricket.sport=sc.next();
cricket.tournament=sc.next();
cricket.sportid=sc.nextInt();

Player susritha = new Player();
Scanner sc1 = new Scanner(System.in);
System.out.println("Enter Player Details");
susritha.playerid=sc1.nextInt();
susritha.name=sc1.next();
Player.tournament =sc1.next();


System.out.println("========Sports Details ============");
System.out.println("Sportname ="+cricket.sport);
System.out.println("Sportid ="+cricket.sportid);
System.out.println("Sport Tournament ="+Sport.tournament);

System.out.println("========Player Details ============");
System.out.println("Playerid ="+susritha.playerid);
System.out.println("Player name ="+susritha.name);
System.out.println("Tournament Name"+Player.tournament);


}
}