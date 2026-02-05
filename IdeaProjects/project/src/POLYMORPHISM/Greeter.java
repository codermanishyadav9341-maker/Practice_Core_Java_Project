package POLYMORPHISM;

class Greeter {
    void great(){
        System.out.println("Hello");
    }
    void great(String name){
        System.out.println("Hello " +name);
    }
    void great(String name,double time){
        System.out.println("Good morning " +time+ " " +name);
    }

    public static void main(String[] args) {
        Greeter so = new Greeter();

        so.great();
        so.great("Riya");
        so.great("Riya" , 6.20);
    }
}
