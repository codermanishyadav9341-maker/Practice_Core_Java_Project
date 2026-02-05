package Java_Inheritance;

 class LivingBeing {
     public void breath(){
         System.out.println("Breathing.......");
     }
}

class Animal1 extends LivingBeing{
     public void eat(){
         System.out.println("Eating.......");
     }
}

class Dog1 extends Animal5 {
     public void bark(){
         System.out.println("Barking........");
     }

     public static void main(String[] args){

         Dog1 so = new Dog1();
      //   so.breath();
         so.eat();
         so.bark();
     }
}
