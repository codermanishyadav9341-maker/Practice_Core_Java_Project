package OVERLOADED;

 class Animal {
     void cow(){
         System.out.println("Cow eats grass");
     }
}
 class Dog extends Animal{
     void cow(){
         System.out.println("Cow gives us milk");
     }

     void goat(){
         System.out.println("Goat eats grass");
     }

     public static void main(String[] args) {

         Dog s = new Dog();
         s.cow();
         s.goat();

         Animal so = new Animal();

         so.cow();

     }
 }





