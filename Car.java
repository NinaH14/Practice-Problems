import java.util.Scanner;

public class Car {
public String model;
public String brand;
public int mileage;
public Car (String model, String brand, int mileage ) {

this.model = model;   
this.brand = brand;
this.mileage = mileage;
}
    public void displayInfo() {
System.out.println(  model+ " "  + brand);
    }

public void drive(int mile) {
    if (mile > 0 ) {
this.mileage = mile + mileage; 
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
        int mile= 50;
        
        
        
        Car myCar = new Car(model, brand,  initialmilage);
        myCar.drive(50);
        int result = myCar.mileage;
        
                System.out.println("car infomation:" + brand+ " " + model+ " " + result + "!");
    }
        

}
}