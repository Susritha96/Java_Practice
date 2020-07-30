import java.util.Scanner;

class OneDigit{
public static void main(String args[]){
System.out.println("Enter the number");
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int sum = 0; 
  
        while (a > 0 || sum > 9)  
        { 
            if (a == 0) { 
                a = sum; 
                sum = 0; 
            } 
            sum += a % 10; 
            a /= 10; 
        } 
        
System.out.println(sum);
}	
}
 