package inheritance;

public class CricketApp {

	public static void main(String[] args) {
		
		

		
		Player player1 = new Batter("Virat Kohli", 32, "India",12000, 41, 183);
		player1.play();
		player1.displayPlayerDetails();
		
		System.out.println("-----------------------");
		
//		player1 = new Bowler("V Kumar",30,"India",500, 5.23, 49.3);
//		player1.play();
//		player1.displayPlayerDetails();
		
		System.out.println(player1 instanceof Player);
		
		System.out.println(player1 instanceof Batter);
		
		System.out.println(player1 instanceof Object);
		
		// A sub type object is always an instance of super type
		// Vice Versa is not true

	}

}
