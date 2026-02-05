package Inheritance1;

public class Animal {
     void makeSound(){
         System.out.println("Animal Sounds");
     }
}

class Dog extends Animal{
     void makeSound(){
         System.out.println("Dog barks");
     }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();


    }
}
