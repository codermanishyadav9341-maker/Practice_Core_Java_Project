package POLYMORPHISM_ROOF;

public class Vehicle {
    public void displayInfo(){
        System.out.println("Generic Vehicle");
    }
}

class Car extends Vehicle{
    public void displayInfo(){
        System.out.println("Car: 4 Wheels");
    }
}

class Bike extends Vehicle{
    public void displayInfo(){
        System.out.println("Bike: 2 Wheels");
    }

    public static void main(String[] args){
        Vehicle so = new Vehicle();
        so.displayInfo();

        Car co = new Car();
        co.displayInfo();

        Bike bb = new Bike();
        bb.displayInfo();

    }
}
