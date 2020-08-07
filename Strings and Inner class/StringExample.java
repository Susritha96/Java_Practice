class StringExample{
public static void main(String args[]){
StringBuffer sb = new StringBuffer("hello");
sb.append("world");
System.out.println("=========== StringBuffer ===========");
System.out.println(sb);
StringBuilder x = new StringBuilder("hello");
x.append("world");
System.out.println("=========== StringBuilder ===========");
System.out.println(x);
}
}