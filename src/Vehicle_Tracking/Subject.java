package Vehicle_Tracking;
///@Interface Subject 
///@Breif Interface subject for design pattern
///
/// Used to regerister, remove, and notify observers 
public interface Subject {
	///function for overriding by classes which implement Subject interface
	void registerObserver(Observer observer);
	///function for overriding by classes which implement Subject interface
	void removeObserver(Observer observer);
	///function for overriding by classes which implement Subject interface
	void notifyObservers();
}
