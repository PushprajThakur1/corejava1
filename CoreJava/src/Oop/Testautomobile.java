package Oop;

public class Testautomobile {
	public static void main(String[] args) {
		
		Automobile a = new Automobile ();
		a.setolor("black");
		a.setspeed(100);
		a.setmake("Scorpio");
		a.set$NO_OF_GEARS(15);
		a.setaccelerator(12);
		a.setchangegear(5);
		 
		
		System.out.println(a.getcolor());
		System.out.println(a.getspeed());
		System.out.println(a.getmake());
		System.out.println(a.get$NO_OF_GEARS());
		System.out.println(a.getaccelerator());
		System.out.println(a.getchangegear());
		
		
	}

}
