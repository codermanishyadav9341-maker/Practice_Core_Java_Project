package Practice;

  class Vehicle {
      String brand;
      int speed;

      Vehicle(String brand, int speed) {          //    Using Constructors;
          this.brand = brand;
          this.speed = speed;

      }
//        Using Methods;

      public void Start() {
          System.out.println(brand + " is Starting..........");
      }

      public void Stop() {
          System.out.println(brand + " is Stoping..............");
      }

      public void ShowInfo() {
          System.out.println("Brand:- " + brand);
          System.out.println("Speed:- " + speed + " km/hr");
      }
  }
    class car extends Vehicle{             // Second Class;

         int fuelLevel;

         car(String brand , int speed, int fuelLevel){         // Second Constructors;
             super(brand,speed);
             this.fuelLevel = fuelLevel;
         }

         public void refuel(int amount){
             fuelLevel += amount;
             System.out.println("Car refuel Current Fuel:- " +fuelLevel+ "%");
         }

    }


    class ElectricCar extends car{
         int batteryPercentage;

         ElectricCar(String brand,int speed,int fuelLevel,int batteryPercentage){
             super(brand,speed,fuelLevel);
             this.batteryPercentage = batteryPercentage;
         }

         public void chargeBattery(int amount) {
             batteryPercentage += amount;
             if (batteryPercentage >= 100) {
                 batteryPercentage = 100;
                 System.out.println("ElectricCar Charge is:- " + batteryPercentage + "%");
             } else {
                 System.out.println("Battery is ChargeLess");
             }

         }


         public void ShowInfo(){
             super.ShowInfo();
             System.out.println("ElectricCar Charge is:- " + batteryPercentage + "%");
         }

        public static void main(String[] args) {

             ElectricCar so = new ElectricCar("Tyota",50,80,90);

             so.Start();
             so.ShowInfo();
             so.refuel(70);
             so.chargeBattery(50);
             so.Stop();
        }

    }


