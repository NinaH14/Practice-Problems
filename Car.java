import java.util.Scanner;

public class Car {
public String model;
public String brand;
public int mileage;
public Car (String model, String brand, int mileage ) {

this.model = model;   //constructors that take in the model, brand, and milage
this.brand = brand;
this.mileage = mileage;
}
    public void displayInfo() { //method that display the information of the car
System.out.println(  model+ " "  + brand);
    }

public void drive(int mile) { 
    if (mile > 0 ) {
this.mileage = mile + mileage; // the mileage of the car will increase based on how many miles you drive
}

 return;

}

public static void main(String[] args) {
   
    try (Scanner in = new Scanner(System.in)) {
        System.out.println( " Enter car model:");
          String model = in.nextLine();
               
        System.out.println ("Enter car brand:");
        String brand = in.nextLine();
        
        
        int initialmilage = 100;
        
        
        Car myCar = new Car(model, brand,  initialmilage);
        myCar.drive(50);
        int result = myCar.mileage;
        
                System.out.println("car infomation:" + brand+ " " + model+ " " + result + "!");
    }
        

}
}