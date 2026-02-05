package INHERITANCE;

 class Single {
     void father(){
         System.out.println("property");
     }
}
  class child extends Single{
     void son(){
         System.out.println("Children");

     }

      public static void main(String[] args) {

         child so = new child();

         so.father();
         so.son();

      }
  }
