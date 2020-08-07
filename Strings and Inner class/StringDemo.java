class StringDemo{
public static void main(String args[]){
String s1 = "admin";
String s2 = "admin";
String s3 = "Admin";
String s4 = "B";
String s5 = "A";
String s6 ="";
String s7 = "     Hello World      ";
String s8 = "java follows oops concepts, java is full of oops";
System.out.println("=============== (.equals) =============");
System.out.println(s1.equals(s2));
System.out.println(s1.equals(s3));
System.out.println("=============== equalsIgnoreCase =============");
System.out.println(s1.equalsIgnoreCase(s3));
System.out.println("=============== (==) =============");
System.out.println(s1==s2);
System.out.println(s1==s3);
System.out.println("=============== CompareTo =============");
System.out.println(s4.compareTo(s5));
System.out.println(s4.compareTo(s4));
System.out.println("=============== (length()) =============");
System.out.println(s1.length());
System.out.println("=============== isEmpty =============");
System.out.println(s6.isEmpty());
System.out.println("=============== trim =============");
System.out.println(s7);
System.out.println(s7.trim());
System.out.println("=============== toUpperCase =============");
System.out.println(s1.toUpperCase());
System.out.println("=============== toLowerCase =============");
System.out.println(s7.toLowerCase());
System.out.println("=============== substring =============");
System.out.println(s8.substring(5));
System.out.println(s8.substring(5,8));
System.out.println("=============== replace =============");
System.out.println(s8.replace("java","python"));
System.out.println("=============== split =============");
String x[] = s8.split(",");
for(String i : x){
System.out.println(i);
}
String y[] = s8.split(" ");
for(String i : y){
System.out.println(i);
}
}
}