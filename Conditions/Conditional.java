import java.util.Scanner;

class If_Condition{
	int a, b, c, d;
	void greaterThan(int a, int b){
		if(a > b){
			System.out.println(a + " is graeter than " + b);
			}
	}
}
class Conditional{
	public static void main(String args[]){
	If_Condition con = new If_Condition();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two integers: ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	con.greaterThan(a,b);
}
}