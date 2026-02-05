package Inheritance1;

class LivingBeing {
    void breathe(){
        System.out.println("Breathing..........");
    }
}

class anim extends LivingBeing{
    void eat(){
        System.out.println("Eating..........");
    }
}

class dog extends anim{
    void bark(){
        System.out.println("Barking..........");
    }

    public static void main(String[] args){

        dog  d = new dog();

        d.breathe();
        d.eat();
        d.bark();
    }
}
