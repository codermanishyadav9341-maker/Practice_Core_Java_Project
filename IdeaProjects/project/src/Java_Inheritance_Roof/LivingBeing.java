package Java_Inheritance_Roof;

 class LivingBeing {
     public void breathe(){
         System.out.println("Breathing........");
     }
}

class Animal2 extends LivingBeing{
     public void eat(){
         System.out.println("Eating.........");
     }
}

class Dog1 extends Animal2{
     public void Bark(){
         System.out.println("Barking........");
     }

     public static void main(String[] args){

         Dog1 dd = new Dog1();
         dd.breathe();
         dd.eat();
         dd.Bark();

     }
}
