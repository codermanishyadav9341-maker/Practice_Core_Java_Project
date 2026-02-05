package INHERITANCE.Roff;

 class LivingBeing {
     public void breath(){
         System.out.println("Breathing......");
     }
}

class Animal1 extends LivingBeing{
     public void eat(){
         System.out.println("Eating......");
     }
}

class Dogs {
     public void bark(){
         System.out.println("Barking......");
     }

     public static void main(String[] args){
         Dogs so = new Dogs();
//         so.breath();
//         so.eat();
         so.bark();

     }
}


