package Java_Encapsulations;

 class Phone {
     private String brand;
     private String model;
     private int batteryLevel;
     private boolean isOn;
     private int volume;

//      Using Constructor;
     Phone(String brand,String model){
         this.brand = brand;
         this.model = model;
         this.batteryLevel = 100;
         this.isOn = false;
         this.volume = 50;
     }

     public void turnOn(){
         if(batteryLevel > 0){
             isOn = true;
         }
          else{
              System.out.println("Battery is dead , Please phone Charge");
         }
     }

     public void turnOff(){
         if(batteryLevel < 0){
             isOn = false;
         }
          else{
              System.out.println("Phone is not Charge");
         }
     }

     public void chargeBattery(int amount){
         if(amount > 0){
             batteryLevel += amount;
             if(batteryLevel > 0){
                 batteryLevel = 100;
             }
              else{
                  System.out.println("Battery cannot ba full charge");
             }
         }
          else{
              System.out.println("amount Cannot be negative");
         }
     }

     public void useBattery(int volume){
         if(volume > 0){
             batteryLevel -= volume;
             if(batteryLevel <= 0){
                 batteryLevel = 0;
                 isOn = false;
             }
         }

     }

     public void setVolume(int volume){
         if(volume > 0 && volume < 10){
            this.volume = volume;
         }
     }

     public String getPhoneStatus(){
         return "Brand:- " +brand+
                 "\nModel:- " +model+
                 "\nBatterLevel:- " +batteryLevel+
                 "\nIsOn:- " +isOn+
                 "\nVolume:- " +volume;
     }

     public static void main(String[] args){
         Phone so = new Phone("HP","Core i5");
         so.chargeBattery(50);
         so.setVolume(30);
         so.useBattery(40);

         System.out.println(so.getPhoneStatus());

     }
}
