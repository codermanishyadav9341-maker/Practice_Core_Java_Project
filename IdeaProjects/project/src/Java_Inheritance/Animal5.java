package Java_Inheritance;

public class Animal5 {
    public void eat(){
        System.out.println("Animal is eating.......");
    }
}

class cat extends Animal5 {
    public void eat(){
        System.out.println("Cat is eating.....");
    }

    public void Sound(){
        System.out.println("Cat meows");
    }
    public static void main(String[] args){
        cat so = new cat();
        so.eat();
        so.Sound();
    }
}
