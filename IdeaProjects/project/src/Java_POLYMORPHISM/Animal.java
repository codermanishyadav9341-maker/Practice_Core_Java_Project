package Java_POLYMORPHISM;

 class Animal {
     public void makeSound(){
         System.out.println("Animal makes Sound");
     }
}

class Dog extends Animal{
     public void makeSound(){
         System.out.println("Dog barks");
     }
}

class cat extends Animal{
     public void makeSound(){
         System.out.println("Cat meows");
     }

     public static void main(String[] args){
         cat co = new cat();
         co.makeSound();

         Dog de = new Dog();
         de.makeSound();

         Animal aa = new Animal();
         aa.makeSound();
     }
}
