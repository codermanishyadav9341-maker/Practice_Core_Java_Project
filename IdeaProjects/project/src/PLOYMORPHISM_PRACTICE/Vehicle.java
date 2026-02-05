package PLOYMORPHISM_PRACTICE;

 class Vehicle {
     public void displayInfo(){
         System.out.println("Generic Vehicle");
     }
}

class car extends Vehicle{
     public void displayInfo(){
         System.out.println("Car : 4 Wheels");
     }
}

class Bike extends Vehicle{
     public void displayInfo(){
         System.out.println("Bike:- 2 Wheels");
     }

     public static void main(String[] args){

         Vehicle v = new Vehicle();
         v.displayInfo();


         car c = new car();
         c.displayInfo();

         Bike b = new Bike();
         b.displayInfo();




     }
}
