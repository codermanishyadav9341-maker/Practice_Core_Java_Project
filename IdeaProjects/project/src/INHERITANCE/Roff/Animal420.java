package INHERITANCE.Roff;

 class Animal420 {

     public void eat1(){
         System.out.println("Animal is eating..........");
     }
}

class cat extends Animal420{
     public void eat1(){
         System.out.println("Cat is eating.........");
     }

     public void sound1(){
         System.out.println("Cat meows");
     }

     public static void main(String[] args){
         cat co = new cat();
         co.eat1();
         co.sound1();
     }
}
