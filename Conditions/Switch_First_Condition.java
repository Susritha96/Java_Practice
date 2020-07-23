import java.util.Scanner;

class Switch_Condition{
	void switchCase(int num){
     switch(num)
     {
        case 1:
	  System.out.println("Case1: Value is: "+num);
	  break;
	case 2:
	  System.out.println("Case2: Value is: "+num);
	  break;
	case 3:
	  System.out.println("Case3: Value is: "+num);
	  break;
        default:
	  System.out.println("Default: Value is: "+num);
      }
}
}
class Switch_First_Condition{
	public static void main(String args[]){
	Switch_Condition con = new Switch_Condition();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter integer between 1-3: ");
	int a = sc.nextInt();
	con.switchCase(a);
}
}