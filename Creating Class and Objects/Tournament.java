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
cricket.sport="Cricket";
cricket.sportid=123;
Sport.tournament="Asian Open";
System.out.println("========Sports Details ============");
System.out.println("Sportname ="+cricket.sport);
System.out.println("Sportid ="+cricket.sportid);
System.out.println("Sport Tournament ="+Sport.tournament);

Player susritha = new Player();
susritha.playerid=102;
susritha.name="Susritha";
Player.tournament = "Asian Open";
System.out.println("========Player Details ============");
System.out.println("Playerid ="+susritha.playerid);
System.out.println("Player name ="+susritha.name);
System.out.println("Tournament Name"+Player.tournament);

}
}