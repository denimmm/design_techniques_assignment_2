package Vehicle_Tracking;

import java.util.List;

public class GPS implements Subject {
	Location current_loc;
	List<Observer> Devices; 
	
	public void changeLocation(Location l) {
		this.current_loc=l;
		this.notifyObservers();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		
	}
	@Override
	public void removeObserver(Observer observer) {
		
	}
	@Override
	public void notifyObservers() {
		
	}

}
