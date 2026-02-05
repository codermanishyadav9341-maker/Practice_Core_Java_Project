package Inheritance1;

class Device {
    void showInfo(String device_Name){
        System.out.println("Device Name:- " +device_Name);
    }
}

class Mobile extends Device{
    void ShowInfo(String op){
        System.out.println("Operating System:- " +op);
    }

    public static void main(String[] args){

        Mobile so = new Mobile();
        so.showInfo("Samsung Galaxy");
        so.ShowInfo("Android");

    }
}
