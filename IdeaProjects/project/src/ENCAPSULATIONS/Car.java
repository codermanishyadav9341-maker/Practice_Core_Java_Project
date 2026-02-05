package ENCAPSULATIONS;

class Car {

//      Private Keywords used;

    private String makes;
    private String models;
    private int years;
    private int mileage;
    private double fuelLevel;

     double MAX_FUEL = 15.0;

//     Using Constructors;

    public Car(String makes,String models,int years){
        this.makes = makes;
        this.models = models;
        this.years = years;
        this.mileage = 0;
        this.fuelLevel = 0;


    }

//     Using getter methods;

    public String getMakes(){
        return makes;
    }
    public String getModels(){
        return models;
    }
    public int getYears(){
        return years;
    }
    public int getMileage(){
        return mileage;
    }
    public double getFuelLevel(){
        return fuelLevel;
    }

//     Using add fuel;

    public void addFuel(double gallon){
        if(gallon > 0){
            fuelLevel += gallon;

            if(fuelLevel > MAX_FUEL){
                fuelLevel = MAX_FUEL;
            }
        }

    }

    public boolean canDriver(int miles){
        double requiredFuel = miles/25.0;
        return fuelLevel >= requiredFuel;
    }

    public void driver(int miles){
        if(miles > 0  && canDriver(miles)){
            mileage += miles;
            fuelLevel -= miles/25.0;
        }
         else{
             System.out.println("Not enough fuel to drive " +miles+ " miles:- ");
        }
    }

    public static void main(String[] args) {

        Car c = new Car("Toyota" , " Corolla" , 2022);
        c.addFuel(10);
        c.canDriver(150);
        c.getFuelLevel();
        c.getMileage();
        c.getMakes();
        c.getModels();
        c.getYears();

        System.out.println("---------Car Features----------");
        System.out.println("Makes:- " + c.getMakes());
        System.out.println("Models :- " + c.getModels());
        System.out.println("Years:- " +c.getYears());
        System.out.println("Mileage:- " + c.getMileage());
        System.out.println("Fuel:- " +        c.getFuelLevel());

    }

}
