import java.util.*;
class LinkedMapDemo{
public static void main(String args[]){
LinkedHashMap<Integer,String> hm = new LinkedHashMap<Integer,String>();
hm.put(1023,"Rahul");
hm.put(1030,"Rahul");
hm.put(1022,"Manoj");
hm.put(1023,"Suresh");
hm.put(1033,"nikhil");
hm.put(1040,"Satish");
hm.put(1035,"Sandy");
hm.put(1036,"Vinod");
System.out.println(hm);
}
}