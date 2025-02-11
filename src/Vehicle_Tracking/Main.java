package Vehicle_Tracking;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
    	
    	Location DANGER_ZONE_CENTER = new Location(6,6);
    	double DANGER_ZONE_RADIUS = 3;
    	
        // Create an instance of GPS
        GPS gps = new GPS();
    	System.out.println("initializing gps");
        // Create observer instances
        CurrentLocationDisplay currentLocationDisplay = new CurrentLocationDisplay();
        TotalTravelledDistanceDisplay totalTravelledDistanceDisplay = new TotalTravelledDistanceDisplay();
        DangerZoneDisplay dangerzone = new DangerZoneDisplay(DANGER_ZONE_CENTER, DANGER_ZONE_RADIUS);
        
        
        System.out.println("initializing observers");
        // Register observers to the GPS subject
        gps.registerObserver(currentLocationDisplay);
        gps.registerObserver(totalTravelledDistanceDisplay);
        gps.registerObserver(dangerzone);
        System.out.println("registering observers");
        
        System.out.println("beginning trip...");
        // Simulate location changes using changeLocation()
        gps.changeLocation(new Location(0, 0));
        TimeUnit.SECONDS.sleep(1);
        gps.changeLocation(new Location(2, 2));
        TimeUnit.SECONDS.sleep(1);
        gps.changeLocation(new Location(2, 4));
        TimeUnit.SECONDS.sleep(1);
        gps.changeLocation(new Location(4, 6));
        TimeUnit.SECONDS.sleep(1);
        gps.changeLocation(new Location(6, 8));
        TimeUnit.SECONDS.sleep(1);
        gps.changeLocation(new Location(8, 10));
        TimeUnit.SECONDS.sleep(1);
        
        System.out.println("finished trip");
        
    }
}