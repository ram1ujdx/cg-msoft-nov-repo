package inheritance;

public class Batter extends Player{

	private int totalRuns;
	private int centuries;
	private int highestRun;
	
	public Batter() {
	}
	
	public Batter(String name, int age, String team,int totalRuns, int centuries, int highestRun) {
		super(name, age, team);
		this.totalRuns = totalRuns;
		this.centuries = centuries;
		this.highestRun = highestRun;
	}
	
	public void play() {
		System.out.println("Batting..");
	}

	public void inputPlayerDetails(String name, int age, String team,int totalRuns, int centuries, int highestRun) {
		super.inputPlayerDetails(name, age, team);
		this.totalRuns = totalRuns;
		this.centuries = centuries;
		this.highestRun = highestRun;
	}
	
	public void displayPlayerDetails() {
		super.displayPlayerDetails();
		System.out.println("Runs : "+totalRuns);
		System.out.println("Centuries : "+centuries);
		System.out.println("Highest Run : "+highestRun);
	}
	
	
	
}
