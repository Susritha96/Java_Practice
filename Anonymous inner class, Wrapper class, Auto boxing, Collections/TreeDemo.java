import java.util.*;
class TreeDemo{
public static void main(String args[]){
TreeSet<String> hs = new TreeSet<String>();
System.out.println(hs.isEmpty());
hs.add("F");
hs.add("E");
hs.add("I");
hs.add("J");
hs.add("K");
hs.add("L");
hs.add("M");
hs.add("N");
hs.add("O");
hs.add("P");
hs.add(" ");
hs.add("P");
System.out.println(hs.isEmpty());
System.out.println(hs);
}
}