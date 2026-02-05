package POLYMORPHISM;

class Vehicle{

     void display_Information(){

         System.out.println("Generic Vehicle");
     }
}

class car extends Vehicle{
     void display_Information(){
         System.out.println("4 Wheels");
     }
}

class bike extends Vehicle{
     void display_Information(){
         System.out.println("2 Wheels");
     }

    public static void main(String[] args) {

         Vehicle sp = new Vehicle();
         sp.display_Information();


       bike b = new bike();
       b.display_Information();


       car c = new car();
       c.display_Information();






    }
}
