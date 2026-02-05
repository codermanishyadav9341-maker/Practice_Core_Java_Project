package Java_Inheritance;

 class Parent {
     Parent(){
         System.out.println("Parent constructor called");
     }
}

class Child extends Parent{
     Child(){
         System.out.println("Child Constructor called");
     }

     public static void main(String[] args){
         Child so = new Child();
     }
}
