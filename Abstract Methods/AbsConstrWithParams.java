abstract class ShowRoom{
	abstract void car_model();
	abstract void cost();
	void showRoomAddr(){
		System.out.println("700 E Ash");
	}
	ShowRoom(String name){
		System.out.println("ShowRoom constructor" + name);
	}
}
class Maserati extends ShowRoom{
	Maserati(String name){
	super("\nSusritha's showRoom");
	System.out.println("Maserati constructor and the model name is "+name);
	}
	void car_model(){
		System.out.println("Maserati GranTurismo");
	}
	void cost(){
		System.out.println("cost of GranTurismo is 90k");
	}
}
class AbsConstrWithParams{
	public static void main(String args[])
{
	ShowRoom x = new Maserati("GranTurismo");
	x.showRoomAddr();
	x.cost();
	x.car_model();
}
}


