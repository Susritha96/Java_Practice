abstract class Shapes{
	abstract void area(int a,int b);
	abstract void perimeter(int a, int b);
}
class Rectangle extends Shapes{
	void area(int a,int b){
		int c = a*b;
		System.out.println("Area of Rectangle is: "+c);
	}
	void perimeter(int d,int e){
		int f = 2*(d+e);
		System.out.println("Perimeter of Rectangle is: "+f);
	}
}
class AbsShapes{
	public static void main(String args[]){
	Rectangle shape = new Rectangle();
	shape.area(13,12);
	shape.perimeter(13,12);
	}
}