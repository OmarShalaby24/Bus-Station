

public class Manager extends Person {
	
	public Manager() {
		this.username=null;
		this.password=null;
		
	}
	
	public Manager(String username,String password) {
		this.username=username;
		this.password=password;
	}
	
	public String getUsername(){
		return username;
	}
	public void setUsername(String username) {
		this.username=username;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	
	public void DeleteTrip() {
		
	}
	
}
