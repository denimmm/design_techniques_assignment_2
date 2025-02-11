package Vehicle_Tracking;
///@class DangerZoneDisplay
///@brief detects dangerous locations
///
///warns the user if their location is in the dangerzone
///
public class DangerZoneDisplay implements Observer {
	//radius of zone
	private double dangerZoneRadius;
	//center of danger zone
	private Location dangerZoneCenter;
	
	//creates a non-functional danger zone
	public DangerZoneDisplay() {
		dangerZoneCenter = new Location();
		dangerZoneRadius = 0;
		
	}
	///creates a functional dangerzone
	///
	///@param location of the center of the zone
	///@param radius of the zone as a double
	public DangerZoneDisplay(Location location, double r) {
		this.dangerZoneCenter = location;
		this.dangerZoneRadius = r;
	}
	///sets the radius of the dangerzone
	///
	///@param double radius
	public void setRadius(double r) {
		this.dangerZoneRadius = r;
	}
	///sets the center of the dangerzone
	///
	///@param Location object of the center of the zone
	public void setDangerZone(Location location) {
		this.dangerZoneCenter = location;
		
	}
	
	///checks and warns the user each update if they are in the dangerzone
	///
	///@param Location of the subject
	public void update(Location location){
		//check within radius
		if (Location.calculateDistance(location, dangerZoneCenter) <= dangerZoneRadius) {
			System.out.println("WITHIN DANGER ZONE !");
		}
		
	}
}
