package PLOYMORPHISM_PRACTICE;

class Greeter{
    public void greet(){
        System.out.println("Hello");
    }

    public void greet(String name){
        System.out.println("Hello: " +name);
    }

    public void greet(String time,String name){
        System.out.println("Good " +time+ " " +name);
    }

    public static void main(String[] args) {

        Greeter so = new Greeter();
        so.greet();
        so.greet("Riya");
        so.greet("Morning","Riya");

    }
}
