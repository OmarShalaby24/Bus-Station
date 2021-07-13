
public class Bus extends Vehicle{
	final int NumberOfSeats = 50;
	
	public static boolean isComplete(int Available) {
		if(Available == 0) {
			Error.display("Sorry but this Trip is FULL");
			return true;
		}
		else
			return false;
	}
}
