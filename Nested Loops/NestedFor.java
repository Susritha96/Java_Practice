import java.util.Scanner;

class NestedFor{
public static void main(String args[]){
System.out.println("Enter number of rows");
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
for(int row= 1 ; row<=a; row++){    
 for (int col = 1;col<=row;col++){
   System.out.print(col);
   if(col==row){
	for(int c =row-1;c >=1;c--){
           System.out.print(c);
}
}
}
System.out.println();
}
}
}