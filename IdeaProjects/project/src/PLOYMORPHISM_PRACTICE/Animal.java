package PLOYMORPHISM_PRACTICE;

 class Animal {

     public void makeSound(){
         System.out.println("Animal Makes Sound");
     }
}

class Dog extends Animal{
     public void makeSound(){
         System.out.println("Dogs Barks");
     }
}

class Cat extends Animal{
     public void makeSound(){
         System.out.println("Cat meows");
     }

    public static void main(String[] args) {

         Animal a = new Animal();
         a.makeSound();

         Dog d = new Dog();
         d.makeSound();

         Cat c = new Cat();
         c.makeSound();
    }
}
