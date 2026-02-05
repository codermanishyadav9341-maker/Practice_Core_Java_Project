package Java_POLYMORPHISM;

 class Greeter {
     public void greet(){
         System.out.println("Hello");
     }

     public void greet(String name){
         System.out.println("Hello , " +name);
     }

     public void greet(String time,String name){
         System.out.println(time+ "," +name);
     }

     public static void main(String[] args){
         Greeter ge = new Greeter();
         ge.greet();
         ge.greet("Riya");
         ge.greet("Good Morning","Riya");

     }
}
