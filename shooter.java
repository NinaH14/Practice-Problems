    public class shooter {

public double calculateSpeed(double distance){

double targetRPM = 0; // change targetRPM based n distance to target
if (distance <= 5.0 ) { 
    targetRPM = 1000;}

else if (distance <= 10.0 ) {
  targetRPM= 5000; }

   else if (distance <= 30.0 ) {
     targetRPM = 10000; }

else {targetRPM = 0.0; } // if not the following distance range, targetRPM will be set to zero, wont even try to shoot

return targetRPM;
}
   
public String status(double distance) { // gives a status of whether we can shoot
if (distance >= 20.0 ) {return "out of range";}
else return "can shoot";
 
}
public double calculateAngle(double distance, double velocity) { 
    
double angle = (distance) / (velocity * velocity); // used part of the projectile motion formula to calculate the angle needed to shoot

return angle;
 }

 
public static void main(String[] args) {
    shooter myShooter = new shooter(); 
    double distance = Math.random() * 35.0; // randomly generate a distance between 0 and 35
   
   
    double rpm = myShooter.calculateSpeed(distance);
    String currentStatus = myShooter.status(distance);

System.out.println(" " + distance );
System.out.println(" " + rpm );
System.out.println(" " + currentStatus );

double angle = myShooter.calculateAngle(distance, 50.0);
System.out.println(" " + angle );
 }
 
 
 }
