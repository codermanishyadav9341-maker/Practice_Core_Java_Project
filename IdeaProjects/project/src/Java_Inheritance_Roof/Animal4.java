package Java_Inheritance_Roof;

public class Animal4 {

    public void eat(){
        System.out.println("Animal is eating......");
    }
}

class Cat extends Animal4{

    public void eat(){
        System.out.println("Cat is eating......");
    }

    public void Sound(){
        System.out.println("Cat meows");
    }

    public static void main(String[] args) {

        Cat cc = new Cat();
        cc.eat();
        cc.Sound();
    }
}
