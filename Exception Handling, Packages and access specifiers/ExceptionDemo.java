class ExceptionDemo{
public static void main(String args[]){
int a =10,b=0;
String name = null;
System.out.println("Statement - 1");
try{
System.out.println("Statement - 2 and division "+(a/b));
//System.out.println("Statement - 3");
System.out.println("Statement - 3 and length = "+name.length());
}
catch(NullPointerException np){
np.printStackTrace();
}
finally{
System.out.println("Finally block");
}
System.out.println("Statement - 4");
System.out.println("Statement - 5");


}
}