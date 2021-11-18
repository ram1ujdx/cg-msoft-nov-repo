package inheritance;

public class CricketApp {

	public static void main(String[] args) {
		
		

		
		Player player1 = new Batter("Virat Kohli", 32, "India",12000, 41, 183);
		player1.play();
		player1.displayPlayerDetails();
		
		System.out.println("-----------------------");
		
		Player player2 = new Bowler("V Kumar",30,"India",500, 5.23, 49.3);
		player2.play();
		player2.displayPlayerDetails();
		


	}

}
