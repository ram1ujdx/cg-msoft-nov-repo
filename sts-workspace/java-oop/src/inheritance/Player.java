package inheritance;

public class Player {

	protected String name;
	protected int age;
	protected String team;
	
	public Player() {
	}
	
	
	
	public Player(String name, int age, String team) {
		super();
		this.name = name;
		this.age = age;
		this.team = team;
	}



	public void catchTheBall() {
		System.out.println("The ball is caught...");
	}
	
	public void play() {
		System.out.println("Playing..");
	}
	
	
	public void inputPlayerDetails(String name, int age, String team) {
		this.name = name;
		this.age = age;
		this.team = team;
	}



	public void displayPlayerDetails() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Team : "+team);
	}
	
	
}
