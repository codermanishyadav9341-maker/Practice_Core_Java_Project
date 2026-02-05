package INHERITANCE;

 class Animal{
     void sound(){
         System.out.println("Main Makes Sound");
     }
 }



  class cow extends Student {
     void dog(){
         System.out.println("Dogs are barks:- ");
     }

     public static void main(String[] args){

         cow scan = new cow();



         System.out.println("------------------------");
         scan.dog();
     }
  }