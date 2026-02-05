package Inheritance1;

 class Book {
     void showDetails(String titles,String author){
         System.out.println("Titles:- " +titles+ "\n Author:- " +author);
     }
}

class LibraryBook extends Book{
     void showDetails(int shelfNumber){
         System.out.println("ShelfNumber:- " +shelfNumber);
     }

     public static void main(String[] args){

         LibraryBook so = new LibraryBook();

         so.showDetails("Java Basics","John Smith");
         so.showDetails(5);
     }
}
