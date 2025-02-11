package Vehicle_Tracking;


///@class Location
///
///@brief holds an x,y coordinate Location
///
///can perform calculations for distance
public class Location {
 private double x;
 private double y;
 
 ///default constructor, make s aLocaiton of (0,0)
 public Location() {
	 this.x=0.0;
	 this.y=0.0;
 }
 ///creates a location with x and y parameters
 ///
 ///@param double x coordinate
 ///@param double y coordinate
 public Location(double x, double y) {
	 this.x=x;
	 this.y=y;
 }
 
 ///creates a location with another Location
 ///
 ///@param Location to copy
 public Location (Location l) {
	 this.x=l.getX();
	 this.y=l.getY();
	 
 }

 ///get the x value of a location
 ///@return double x value
 public double getX() {
	 return this.x;
 }

  ///get the y value of a location
 ///@return double y value
 public double getY() {
	 return this.y;
 }

 ///sets the x value of a location
 ///@param double x value
 public void setX(double x) {
	 this.x=x;
 }

  ///sets the y value of a location
 ///@param double y value
 public void setY(double y) {
	 this.y=y;
 }
 
 ///converts the coordinate to a string
 ///@return string "x; y"
 @Override
 public String toString() {
	 return "Location: ("+this.x+"; "+this.y+")";
 }
 
 ///static method, calculates the distance between two points
 ///@param Location first location
 ///@param Location second location
 ///@return double distance
 public static double calculateDistance(Location l1, Location l2) {
	 double distance = Math.sqrt(Math.pow(l2.x-l1.x, 2)+Math.pow(l2.y-l1.y, 2));
	 return distance;
 }
}
