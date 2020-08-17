import java.util.*;
class TreeMapDemoSet{
public static void main(String args[]){
TreeMap<Integer,String> hm = new TreeMap<Integer,String>();
hm.put(1023,"Rahul");
hm.put(1030,"Rahul");
hm.put(1022,"Manoj");
hm.put(1023,"Suresh");
hm.put(1033,"nikhil");
hm.put(1040,"Satish");
hm.put(1035,"Sandy");
hm.put(1036,"Vinod");
System.out.println(hm);
System.out.println(hm.keySet());

Set<Integer> s = hm.keySet();
Iterator i = s.iterator();
while(i.hasNext()){
System.out.println(i.next());
}
Collection c =hm.values();
Iterator x = c.iterator();
while(x.hasNext()){
System.out.println(x.next());
}
}
}