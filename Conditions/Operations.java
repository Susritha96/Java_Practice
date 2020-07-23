import java.util.Scanner;

class Operators{
	int a, b, c, d, e, f, g, h;
	void sum(int a, int b){
		c = a + b;
		System.out.println("Sum of two integers: "+ c);
	}
	void difference(int a, int b){
		d = a - b;
		System.out.println("Difference of two integers: " + d);
	}
	void multiplication(int a, int b){
		e = a * b;
		System.out.println("Multiplication of two integers: " + e);
	}
	void division(int a, int b)
	{
		f = a / b;
		System.out.println("Division of two integers: " + f);
	}
	void modulus(int a, int b)
	{
		g = a % b;
		System.out.println("Modulus of two integers: " + g);
	}
	void doubleEquals(int a, int b){
		if(a==b){
			System.out.println(a + " is equals to "+ b);
		}
	}
	void greaterThan(int a, int b){
		if(a > b){
			System.out.println(a + " is greater than " + b);
		}
	}
}
class Operations{
	public static void main(String args[])
	{
		Operators op = new Operators();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		op.sum(a,b);
		op.difference(a,b);
		op.multiplication(a,b);
		op.division(a,b);
		op.modulus(a,b);
		op.doubleEquals(a,b);
		op.greaterThan(a,b);
		
	}
}