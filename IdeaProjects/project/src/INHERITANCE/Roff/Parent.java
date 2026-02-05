package INHERITANCE.Roff;

 class Parent {

     Parent(){
         System.out.println("Parent Constructor called");
     }
}

class child extends Parent{
     child(){
         System.out.println("Child Constructors Called");
     }

     public static void main(String[] args){
         child c = new child();
     }
}