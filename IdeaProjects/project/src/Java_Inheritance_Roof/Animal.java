package Java_Inheritance_Roof;

 class Animal {

     public void makeSound(){
         System.out.println("Animal has Different Sound");
     }
}

class Dog extends Animal2 {

     public void makeSound(){
         System.out.println("Dogs Barks");
     }

     public static void main(String[] args){
         Dog d = new Dog();
         d.makeSound();

     }
}
