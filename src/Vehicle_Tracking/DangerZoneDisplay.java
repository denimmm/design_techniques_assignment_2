package Vehicle_Tracking;

public class DangerZoneDisplay implements Observer {
	private double dangerZoneRadius;
	private Location dangerZoneCenter;
	
	public DangerZoneDisplay() {
		dangerZoneCenter = new Location();
		dangerZoneRadius = 0;
		
	}
	
	public DangerZoneDisplay(Location location, double r) {
		this.dangerZoneCenter = location;
		this.dangerZoneRadius = r;
	}
	
	public void setRadius(double r) {
		this.dangerZoneRadius = r;
	}
	
	public void setDangerZone(Location location) {
		this.dangerZoneCenter = location;
		
	}
	
	public void update(Location location){
		//check within radius
		if (Location.calculateDistance(location, dangerZoneCenter) <= dangerZoneRadius) {
			System.out.println("WITHIN DANGER ZONE !");
		}
		
	}
}
