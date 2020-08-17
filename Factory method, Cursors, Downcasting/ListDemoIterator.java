import java.util.*;
class ListDemoIterator{
public static void main(String args[]){
ArrayList<Integer>  al = new ArrayList<Integer>();
al.add(34);
al.add(30);
al.add(22);
al.add(12);
al.add(13);
al.add(27);
al.add(45);
al.add(87);
al.add(17);
al.add(3);
al.add(4);
al.add(40);
al.add(340);
System.out.println(al);
ListIterator<Integer> li = al.listIterator();
while(li.hasNext()){
System.out.println(li.next());
}
System.out.println("===========================");
while(li.hasPrevious()){
System.out.println(li.previous());
}
}
}