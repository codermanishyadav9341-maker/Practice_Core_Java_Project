package Java_Inheritance;

class Animal {
    public void makeSound(){
        System.out.println("Animal has Different Sound");
    }
}

class Dog extends Animal5 {
    public void makeSound(){
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
    }
}
