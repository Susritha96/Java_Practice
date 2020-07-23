import java.util.Scanner;

class NestedIF_Condition{
	int a, b;
	void comparison(int a, int b){
		if(a > b){
			System.out.println(a + " is greater than " + b);
			}
		else if(a < b){
			System.out.println(a + " is less than " + b);
		}
		else{
			System.out.println(a + " is equal to " + b);
		}
	}
}
class NestedIF_First_Condition{
	public static void main(String args[]){
	NestedIF_Condition con = new NestedIF_Condition();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two integers: ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	con.comparison(a,b);
}
}