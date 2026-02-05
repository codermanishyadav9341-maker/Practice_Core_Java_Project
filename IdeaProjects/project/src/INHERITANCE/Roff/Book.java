package INHERITANCE.Roff;

 class Book {
     String title;
     String author;

     Book(String title,String author){
         this.title = title;
         this.author = author;
     }

     public void showDetails(){
         System.out.println("Title:- " +title);
         System.out.println("Author:- " +author);
     }
}

class LibraryBook extends Book{
     int shelfNumber;

     LibraryBook(String title,String author,int shelfNumber){
         super(title,author);
         this.shelfNumber = shelfNumber;
     }

     public void showDetails(){
         System.out.println("Title:- " +title);
         System.out.println("Author:- " +author);
         System.out.println("Shelf Number:- " +shelfNumber);
     }

     public static void main(String[] args){
         LibraryBook so = new LibraryBook("Java Basics","John Smith",5);
         so.showDetails();
     }
}
