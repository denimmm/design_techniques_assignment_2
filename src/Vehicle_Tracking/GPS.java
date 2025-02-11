package Vehicle_Tracking;

import java.util.ArrayList;

public class GPS implements Subject {
	Location current_loc;
	ArrayList<Observer> Devices; 
	
	public GPS(){
		this.current_loc = new Location();
		this.Devices = new ArrayList<Observer>();
		
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
		for(Observer observer : Devices) {
			observer.update(current_loc);
			
			
		}
	}

}
