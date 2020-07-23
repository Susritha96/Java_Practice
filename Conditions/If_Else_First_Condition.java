import java.util.Scanner;

class If_Else_Condition{
	int a, b;
	void greaterThan(int a, int b){
		if(a > b){
			System.out.println(a + " is greater than " + b);
			}
		else{
			System.out.println(a + " is not greater than " + b);
		}
	}
}
class If_Else_First_Condition{
	public static void main(String args[]){
	If_Else_Condition con = new If_Else_Condition();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two integers: ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	con.greaterThan(a,b);
}
}