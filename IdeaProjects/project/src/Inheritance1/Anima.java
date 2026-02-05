package Inheritance1;

class Anima {
    void eat(){
        System.out.println("Cat is eating");
    }
}

class cat extends Anima{
    void sound(){
        System.out.println("Cat meows");
    }

    public static void main(String[] args){

        cat c = new cat();
        c.eat();
        c.sound();

    }
}
