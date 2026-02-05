package Inheritance1;

 class Parent {
     void parent(){
         System.out.println("Parent Constructors Called");
     }
}

class Child extends Parent{
     void Child(){
         System.out.println("Child Constructors Called");
     }

    public static void main(String[] args) {

         Child c = new Child();
         c.parent();
         c.Child();
    }
}
