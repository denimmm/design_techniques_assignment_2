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
	}
	public void changeLocation(Location l) {
		this.current_loc=l;
		this.notifyObservers();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		Devices.add(observer);
	}
	@Override
	public void removeObserver(Observer observer) {
		Devices.remove(observer);
	}
	@Override
	public void notifyObservers() {

		for(Observer device:Devices) {
			device.update(current_loc);
		}
	}

}
