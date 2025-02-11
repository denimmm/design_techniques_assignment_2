package Vehicle_Tracking;
///@brief Class that displays the current location of the vehicle
///
///@details This class is an observer of the GPS class and displays the current location of the vehicle

public class CurrentLocationDisplay implements Observer {
	private Location current;
	///@brief default constructor
	///
	///@details makes a blank location object

	public CurrentLocationDisplay() {
		this.current = new Location(); 
	}
	///@brief Parameterized constructor
	///
	///@details makes a location object with the given location
	public CurrentLocationDisplay(Location l) {
		this.current = new Location(l); 
	}
	///@brief Displays the current location of the vehicle
	///
	///@details prints the current location of the vehicle
	///@return void

	public void displayCurrentLocation() {
		System.out.println(this.current.toString());
	}
	///@brief Updates the current location of the vehicle
	///
	///@details updates the current location of the vehicle when it starts moving.
	///@param new_loc the new location of the vehicle
	///@return void
	@Override
	public void update(Location new_loc) {
		this.current=new_loc;
		displayCurrentLocation();
	}
}
