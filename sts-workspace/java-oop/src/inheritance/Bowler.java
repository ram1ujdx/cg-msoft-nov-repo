package inheritance;

public class Bowler extends Player {

	private int totalWickets;
	private double economy;
	private double average;
	
	
	public Bowler() {
	}
	
	
	
	public Bowler(String name, int age, String team, int totalWickets, double economy, double average) {
		super(name, age, team);
		this.totalWickets = totalWickets;
		this.economy = economy;
		this.average = average;
		
	}



	
	public void play() {
		System.out.println("Bowling...");
	}
	
	

	
	
	public void inputPlayerDetails(String name, int age, String team,int totalWickets, double economy, double average) {
		super.inputPlayerDetails(name, age, team);
		this.totalWickets = totalWickets;
		this.economy = economy;
		this.average = average;
	}
	
	
	public void displayPlayerDetails() {
		super.displayPlayerDetails();
		System.out.println("Total wickets : "+totalWickets);
		System.out.println("Economy : "+economy);
		System.out.println("average : "+average);
	}
	
	
	
	
}
