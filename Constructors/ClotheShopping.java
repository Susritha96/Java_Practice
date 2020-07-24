class 	Mall{
	
	int employees = 10;
}
class Nike extends Mall{
	String store = "Nike";
	Nike(){
		System.out.println("Name of the store is "+this.store);
		System.out.println("Number of employees in the store = "+super.employees);
	}

}
class ClotheShopping{
public static void main(String args[]){
Nike nike1 = new Nike();

}
}