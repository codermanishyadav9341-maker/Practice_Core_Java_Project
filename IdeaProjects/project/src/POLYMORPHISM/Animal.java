package POLYMORPHISM;

 class Animal {
     void makeSound(){
         System.out.println("Animal makes Sounds");
     }
}
 class Dog extends Animal{
     void makesSound(){

         System.out.println("Dogs barks");
     }
 }

 class cat extends Animal{
     void makesSound(){

         System.out.println("Cat meows");
     }

     public static void main(String[] args) {

         cat c = new cat();
         c.makeSound();
         c.makesSound();

         Dog d = new Dog();
         d.makeSound();
         d.makesSound();
     }
 }
