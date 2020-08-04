abstract class ShowRoom{
	abstract void car_model();
	abstract void cost();
	void showRoomAddr(){
		System.out.println("700 E Ash");
	}
	ShowRoom(){
		System.out.println("ShowRoom constructor");
	}
}
class Maserati extends ShowRoom{
	Maserati(){
	super();
	System.out.println("Maserati constructor");
	}
	void car_model(){
		System.out.println("Maserati GranTurismo");
	}
	void cost(){
		System.out.println("cost of GranTurismo is 90k");
	}
}
class AbsConstr{
	public static void main(String args[])
{
	ShowRoom x = new Maserati();
	x.showRoomAddr();
	x.cost();
	x.car_model();
}
}


