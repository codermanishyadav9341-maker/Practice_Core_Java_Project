package INHERITANCE.Roff;

 class Animal {
     public void makeSound(){
         System.out.println("Animal has different Sound");
     }
}

class Dog extends Animal{
     public void makeSound(){
         System.out.println("Dog barks");
     }
     public static void main(String[] args){
         Dog so = new Dog();
         so.makeSound();
     }
}
