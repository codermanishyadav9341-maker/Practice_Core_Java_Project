package Roof_Encapsulation;

public class Car {
    private String make;
    private String model;
    private int years;
    private int mileage;
    private double fuelLevel;


    Car(String make,String model,int years){
        this.make = make;
        this.model = model;
        this.years = years;
        this.mileage = 0;
        this.fuelLevel = 0;

    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYears(){
        return years;
    }

    public int getMileage(){
        return mileage;
    }

    public void addFuel(double gallons){
        if(fuelLevel == 15){
            fuelLevel += gallons;
        }
         else{
             System.out.println("fuelLevel Cannot be Ne");
        }
    }

    public void drive(int miles){
        fuelLevel -= miles;
    }

}
