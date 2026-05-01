    public class shooter {

public double calculateSpeed(double distance){

double targetRPM = 0;
if (distance <= 5.0 ) {
    targetRPM = 1000;}

else if (distance <= 10.0 ) {
  targetRPM= 5000; }

   else if (distance <= 30.0 ) {
     targetRPM = 10000; }

else {targetRPM = 0.0; }

return targetRPM;
}
   
public String status(double distance) {
if (distance >= 20.0 ) {return "out of range";}
else return "can shoot";
 
if (Math.abs(this. angle));{
angle = (distance) / (velocity * velocity);

return angle;
 }
}
 
public static void main(String[] args) {
    shooter myShooter = new shooter(); 
    double distance = 7;
   
    double rpm = myShooter.calculateSpeed(distance);
    String currentStatus = myShooter.status(distance);

System.out.println(" " + distance );
System.out.println(" " + rpm );
System.out.println(" " + currentStatus );

System.out.println(" " + angle );
 }
 
 
 }
