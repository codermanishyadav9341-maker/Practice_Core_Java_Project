package Java_POLYMORPHISM;

 class Vehicle {

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

         Vehicle vo = new Vehicle();
         vo.displayInfo();

         Car ca = new Car();
         ca.displayInfo();

         Bike bk = new Bike();
         bk.displayInfo();
     }
}
