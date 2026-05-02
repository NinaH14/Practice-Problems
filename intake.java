public class intake {
    public String motorstatus = "off";
   public boolean ball = false; 
   public double intakepower = 0.0;

   public void motorOn() { //turns on the motor
    motorstatus = "on";
    System.out.println("The motor is on.");
   }

    public void motorOff() { //turns off the motor
        if (ball){
            ball = false;
            motorstatus = "off";
            System.out.println("The ball is not detected.The motor is off.");
            return;
        }
    
   }
   public void motorON() { // turns on the motor only when ball is detected
        if (ball){
            ball = true;
            motorstatus = "on";
            System.out.println("The ball is detected.The motor is on.");
            return;
        }
    
   }

    public void intakeBall() { 
     if (motorstatus.equals("on")) {
          ball = true;
          System.out.println("The ball is intaked."); 
          motorstatus = "off"; // stops the motor from intaking mor balls
          return;
     }
     else {System.out.println("The motor is off. Cannot intake the ball.");} 
    }

public void adjustIntake(double robotSpeed){ //adjust the intake power based on speed of robot
    if (5 > robotSpeed && robotSpeed > 0){
   intakepower = 0.5;
   System.out.println("The robot is moving at a slow speed. Intake power is set to 0.5.");

    }
 else if (10 > robotSpeed && robotSpeed > 0){
   intakepower = 1.0;
   System.out.println("The robot is moving at a fast speed. Intake power is set to 1.0.");

    }
 else {
    intakepower = 0.0;
    System.out.println("The robot is not moving. Intake power is set to 0.0.");
 }



}
    public static void main(String[] args) { 
        intake myIntake = new intake ();
        if (Math.random() < 0.5) {
            myIntake.motorstatus = "on";
        } else {
            myIntake.motorstatus = "off";
        }
        System.out.println("Motor status: " + myIntake.motorstatus);
        myIntake.intakeBall();
        double robotSpeed = Math.random() * 15; // randomly generate a speed between 0 and 15
        myIntake.adjustIntake(robotSpeed);
        
        
    }

}