package POLYMORPHISM_ROOF;

public class Animal {

    public void makesSound(){
        System.out.println("Animal makes Sound");
    }
}

class Dog extends Animal{
    public void makesSound(){
        System.out.println("Dogs barks");
    }
}

class Cat extends Animal {
    public void makesSound() {
        System.out.println("Cat meows");
    }

}
    class Cow extends Animal{
        public void makesSound(){
            System.out.println("Bhaa");
        }

    public static void main(String[] args){

        Animal aa = new Animal();
        aa.makesSound();

        Cat cc = new Cat();
        cc.makesSound();

        Dog so = new Dog();
        so.makesSound();

        Cow co = new Cow();
        co.makesSound();

    }
}
