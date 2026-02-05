package INHERITANCE.Roff;

 class Device {
     String deviceName;

     Device(String deviceName){
         this.deviceName = deviceName;
     }

     public void showInfo(){
         System.out.println("Device Name:- " +deviceName);
     }
}

class Mobile extends Device{
     String OS;

     Mobile(String deviceName,String OS){
         super(deviceName);
         this.OS = OS;
     }

     public void showInfo(){
         System.out.println("Device Name:- " +deviceName);
         System.out.println("Operating System:- " +OS);
     }

     public static void main(String[] args){
         Mobile so = new Mobile("SAMSUNG","Android");
         so.showInfo();
     }
}
