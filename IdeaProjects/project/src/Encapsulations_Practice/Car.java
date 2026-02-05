package Encapsulations_Practice;

public class Car {
    private String make;
    private String model;
    private int year;
    private int mileage;
    private double fuel;


    Car(String make,String model,int year){
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = 0;
        this.fuel = 0;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public int mileage(){
        return mileage;
    }

    public void addFuel(double gallon){
        if(gallon == 15){
            fuel += gallon;
            System.out.println("Fuel:- " +fuel+ "Litres");
        }
    }

    public void drive(int miles){

    }
}
