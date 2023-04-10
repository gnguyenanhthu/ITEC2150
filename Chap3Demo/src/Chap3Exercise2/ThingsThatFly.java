package Chap3Exercise2;

public class ThingsThatFly {
	public static void main(String[] args) {
		Flight[] myFlights = new Flight[3];
		Flight thing1 = new Airplane("Boeing 747", 2016);
		Flight thing2 = new Bird("Eagle");
		Flight thing3 = new Bird("Hummingbird");
		
		myFlights[0] = thing1;
		myFlights[1] = thing2;
		myFlights[2] = thing3;
		
		
		for (int i = 0; i < myFlights.length; i++) {
			System.out.print(myFlights[i]);
			myFlights[i].fly();
		}
	}
}
