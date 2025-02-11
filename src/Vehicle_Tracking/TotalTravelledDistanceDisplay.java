package Vehicle_Tracking;
///@class TotalTravelledDistanceDisplay 
///
///@brief TotalTravelledDistance to calculate and display total travelled distance
///
///This class is responsible for calculating and showing total number of distance travelled each time a GPS class changes location
public class TotalTravelledDistanceDisplay implements Observer {
	private double distance_traveled;
	private Location previous_location;
	
	/// Unparameterized constructor which initializes object of the class. initiates distance with 0.0, and Location with (0;0), using Location unparameterized constructor
	public TotalTravelledDistanceDisplay() {
		this.distance_traveled=0.0;
		this.previous_location = new Location(); 
	}
	/// Overriden function from Observer intrface, calculates total distance traveled and displays it
	@Override
	public void update(Location new_loc) {
		distance_traveled= distance_traveled + Location.calculateDistance(this.previous_location, new_loc);
		this.previous_location = new_loc;
		System.out.println("Distance Travelled: " + String.format("%.2f", distance_traveled));
	}
	
}
