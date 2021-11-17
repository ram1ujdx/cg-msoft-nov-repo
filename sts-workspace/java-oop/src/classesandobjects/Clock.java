package classesandobjects;

public class Clock {

	private int hours;
	private int minutes;
	private int seconds;
	
	public Clock() {
		this.hours=12;
		this.minutes=0;
		this.seconds=0;
	}

	public Clock(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	public Clock(int seconds) {
		
		//150 -> 0:2:30 
		// 3670 -> 1:1:10
		
		this.hours = seconds/3600;
		seconds = seconds- (this.hours*3600);
		
		this.minutes = seconds/60;
		
		this.seconds = seconds%60;
		
		
	}
	
	
	@Override
	public String toString() {
		return hours+":"+minutes+":"+seconds;
	}
	
	
	
	
}
