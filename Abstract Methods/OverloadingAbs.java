abstract class Restaurant{
	abstract void takeOrder(String item);
	abstract void takeOrder(String item1, String item2);
}
class Ravis extends Restaurant{
	void takeOrder(String item1){
		System.out.println("Items in the order: "+item1);
	}
	void takeOrder(String item1, String item2){
		System.out.println("Items in the order: "+item1+" and "+item2);
	}
}
class OverloadingAbs{
	public static void main(String args[]){
	Ravis ravi = new Ravis();
	ravi.takeOrder("Chicken Biryani");
	ravi.takeOrder("Gulab Jamoon","Laddus");
}
}