package Java_POLYMORPHISM;

 class Transport {

     public void travelMode(){
         System.out.println("Traveling");
     }
}

class Bus extends Transport{
     public void travelMode(){
       System.out.println("Traveling by Bus");
     }
}

class Train extends Transport{
     public void travelMode(){
         System.out.println("Traveling by train");
     }
}

class Flight extends Transport{
     public void travelMode(){
         System.out.println("Traveling by flight");
     }

     public static void main(String[] args){

         Transport ta = new Transport();
         ta.travelMode();

         Bus bb = new Bus();
         bb.travelMode();

         Train tt = new Train();
         tt.travelMode();

         Flight ff = new Flight();
         ff.travelMode();

     }
}
