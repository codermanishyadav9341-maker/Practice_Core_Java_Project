package Chatgpt_Questions;

public class Animal {

    public void Sound(){
        System.out.println("Animal has Different Sound");
    }
}

class Dog extends Animal{
    public void Sound(){
        System.out.println("Dogs Barks");
    }
    public static void main(String[] args){
        Dog dd = new Dog();
        dd.Sound();

    }
}
