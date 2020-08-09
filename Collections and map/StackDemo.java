import java.util.*;
class StackDemo{
public static void main(String args[]){
Stack<String> s= new Stack<String>();
s.push("F");
s.push("G");
s.push("L");
s.push("R");
s.push("W");
s.push("L");
s.push("F");
s.push("U");
s.push("P");
s.push("Z");
s.push("Y");
System.out.println(s);
s.pop();
s.pop();
System.out.println(s);
}
}