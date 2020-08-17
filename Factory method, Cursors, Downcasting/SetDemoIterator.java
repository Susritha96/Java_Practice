import java.util.*;
class SetDemoIterator{
public static void main(String args[]){
TreeSet<Integer>  al = new TreeSet<Integer>();
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
Iterator<Integer> it=al.iterator();
while(it.hasNext()){
System.out.println(it.next());
}
}
}