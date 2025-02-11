package Vehicle_Tracking;

public class TotalTravelledDistanceDisplay implements Observer {
	private double distance_traveled;
	private Location previous_location;
	
	public TotalTravelledDistanceDisplay() {
		this.distance_traveled=0.0;
		this.previous_location = new Location(); 
	}
	@Override
	public void update(Location new_loc) {
		distance_traveled= distance_traveled + Location.calculateDistance(this.previous_location, new_loc);
		System.out.println("Distance Travelled: " + String.format("%.2f", distance_traveled));
	}
	
}
