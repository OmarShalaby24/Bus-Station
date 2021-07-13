

public class Driver extends Person {
	String available;
	String vehicle;
	
	public Driver() {
		this.username=null;
		this.password=null;
		this.available=null;
		this.vehicle=null;
	}
	public String getAvailable() {
		return available;
	}
	public Driver(String username, String available,String vehicle,String password) {
		this.username=username;
		this.password=password;
		this.available=available;
		this.vehicle=vehicle;
	}
	public String isAvailable() {
		return available;
	}
	public String getVehicle() {
		return vehicle;
	}
	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}
	public void setAvailable(String available) {
		this.available = available;
	}
}
