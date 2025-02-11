package Vehicle_Tracking;
///@Class Observer
///@brief Interface for the observer design pattern 
public interface Observer {
///function for overriding by classes which implement Observer interface	
	void update(Location new_loc);
}
