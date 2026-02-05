package Chatgpt_Questions;

public class Vehicle {
    String speed;

    Vehicle(String speed){
        this.speed = speed;
    }

    public void showSpeed(){
        System.out.println("Speed:- " +speed);
    }
}

class Car extends Vehicle{
    String brand;

    Car(String speed , String brand){
        super(speed);
        this.brand = brand;
    }

    public void showSpeed(){
        System.out.println("Brand:- " +brand);
        System.out.println("Speed:- " +speed);
    }

    public static void main(String[] args){

        Car cc = new Car("75km/h","Tyota");
        cc.showSpeed();
    }
}
