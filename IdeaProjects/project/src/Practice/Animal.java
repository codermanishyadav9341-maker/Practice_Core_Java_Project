package Practice;

 class Animal {
     public void Sound(){
         System.out.println("Animals has Different Sound");

     }

}

class Dog extends Animal{
     public void Sound(){
         System.out.println("Dogs Barks");
     }
}

class Cat extends Animal{
     public void Sound(){
         System.out.println("Cat meows");
     }
}

class Cow extends Animal{
     public void Sound(){
         System.out.println("Cows Moo");
     }
     public static void main(String[] args){

         Animal so = new Animal();
         so.Sound();

           Dog d = new Dog();
           d.Sound();

           Cat c = new Cat();
           c.Sound();

           Cow co = new Cow();
           co.Sound();

     }
}
