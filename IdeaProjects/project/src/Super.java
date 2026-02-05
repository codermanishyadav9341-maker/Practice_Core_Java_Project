// class Super {
//    int x = 10;
//}
//
//class child extends Super{
//    int x = 20;
//
//    void run(){
//        System.out.println(x);
//        System.out.println(super.x);  // Parents class ke Variable ko call Karata hai
//    }
//    public static void main(String[] args){
//        child cc = new child();
//        cc.run();
//    }
//}

//
//
//class Parent{
//    public void run(){
//        System.out.println("Parents is running");
//    }
//}
//
//class Child extends Parent{
//    public void run(){
//        super.run();
//        System.out.println("Child is running");         // Parents ke method ko call Karata hai;
//    }
//    public static void main(String[] args){
//        Child cc = new Child();
//        cc.run();
//
//    }
//}

//
//class Parent{
//
//    Parent(){
//        System.out.println("Parents is running");
//    }
//}
//
//class child extends Parent{
//
//    child(){
//        super();
//        System.out.println("Child is running");
//    }
//
//    public static void main(String[] args){
//
//        child cc = new child();
//
//    }
//}


class Animal{
    public void Sound(){
        System.out.println("Animal has Different Sound");
    }
}

class Dog extends Animal{
    public void Sound(){
        System.out.println("Dogs Barks");
    }
}
//
//class Cat extends Animal{
//    public void Sound(){
//        System.out.println("Cat meows");
//    }
//
//    public static void main(String[] args){
////        Animal aa = new Animal();
////        aa.Sound();
////
////        Animal dd = new Dog();
////        dd.Sound();
////
////        Animal cc = new Cat();
////        cc.Sound();
////
//        Animal aa;
//
//       Animal d = new Dog();
//       d.Sound();
//
//       Animal c = new Cat();
//       c.Sound();
//
//    }
//}



//class Test{
//    public static void main(String[] args){
//        final int a = 10;        // final Variable
//
//        System.out.println(a);
//
////        double  a = 20;
//    }
//}


//class Test {
//
//    final void sum(int a, int b) {
//        int sum = (a + b);
//        System.out.println(sum);
//    }
//
//}     // final methods
//
//class Exam extends Test{
//     void sum(int a,int b){
//
//     }
//    public static void main(String[] args){
//
//    }
//}


//
//final class A{
//    void so(){
//        System.out.println("Selling");
//    }
//}
//
//class B extends A{
//    void so(){
//        System.out.println("Selling");
//   }
//                                                   // final class
//    public static void main(String[] args){
//        B b = new B();
//        b.so();
//    }
//}