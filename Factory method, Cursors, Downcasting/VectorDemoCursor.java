import java.util.*;
class VectorDemoCursor{
public static void main(String args[]){
Vector<Integer>  al = new Vector<Integer>();
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
Enumeration<Integer> e=al.elements();
while(e.hasMoreElements()){
System.out.println(e.nextElement());
}
}
}