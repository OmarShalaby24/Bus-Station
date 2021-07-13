
public class Mini_Bus extends Vehicle{
	final int numberOfSeats = 25;
	
	public static boolean isComplete(int Available) {
		if(Available == 0) {
			Error.display("Sorry but this Trip is FULL");
			return true;
		}
		else
			return false;
	}
}
