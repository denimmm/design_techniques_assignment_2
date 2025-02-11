package Vehicle_Tracking;

public class CurrentLocationDisplay implements Observer {
	private Location current;
	
	public CurrentLocationDisplay() {
		this.current = new Location(); 
	}
	public CurrentLocationDisplay(Location l) {
		this.current = new Location(l); 
	}
	
	public void displayCurrentLocation() {
		System.out.println(this.current.toString());
	}
	
	@Override
	public void update(Location new_loc) {
		this.current=new_loc;
	}
}
