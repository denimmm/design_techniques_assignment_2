package Vehicle_Tracking;

import java.util.ArrayList;
///@class GPS
///@brief subject of observers
///
///causes the various display observers to update and controls the current location
public class GPS implements Subject {
	Location current_loc;
	ArrayList<Observer> Devices; 
	
	///default constructor
	///
	///makes a blank gps object
	public GPS() {
		Devices = new ArrayList<>();
		current_loc = new Location(0.0,0.0);
		
	///changes the location of the subject
	///
	///@param Location new location
	}
	public void changeLocation(Location l) {
		this.current_loc=l;
		this.notifyObservers();
	}
	
	///adds observers to the Devices array so they can be updated
	///
	///@param Observer device
	@Override
	public void registerObserver(Observer observer) {
		Devices.add(observer);
	}
	
	///removes an observer from the Devices Array so it will no longer be updated
	///
	///@param Observer device
	@Override
	public void removeObserver(Observer observer) {
		Devices.remove(observer);
	}
	
	
	///calls the update() method on all of the object's observers in the devices array'
	@Override
	public void notifyObservers() {

		for(Observer device:Devices) {
			device.update(current_loc);
		}
	}

}
