package Vehicle_Tracking;

public class Location {
 private double x;
 private double y;
 
 public Location() {
	 this.x=0.0;
	 this.y=0.0;
 }
 public Location(double x, double y) {
	 this.x=x;
	 this.y=y;
 }
 public Location (Location l) {
	 this.x=l.getX();
	 this.y=l.getY();
	 
 }
 public double getX() {
	 return this.x;
 }
 public double getY() {
	 return this.y;
 }
 public void setX(double x) {
	 this.x=x;
 }
 public void setY(double y) {
	 this.y=y;
 }
 
 @Override
 public String toString() {
	 return "Location: ("+this.x+"; "+this.y+")";
 }
 
 public static double calculateDistance(Location l1, Location l2) {
	 double distance = Math.sqrt(Math.pow(l2.x-l1.x, 2)+Math.pow(l2.y-l1.y, 2));
	 return distance;
 }
}
