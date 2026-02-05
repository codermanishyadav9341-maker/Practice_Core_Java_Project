package Java_Inheritance;

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
         System.out.println("OS:- " +OS);
     }

     public static void main(String[] args){
         Mobile so = new Mobile("OPPO","Android");
         so.showInfo();
     }
}
