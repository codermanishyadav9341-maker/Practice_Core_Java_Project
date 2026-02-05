package Encapsulations_Practice;

 class Book {
     private String title;
     private String author;
     private String isbn;
     private int pages;
     private boolean isAvailable;


     Book(String title,String author,String isbn,int pages){
         this.title = title;
         this.author = author;
         this.isbn = isbn;
         this.pages = pages;
         this.isAvailable = true;

     }

     public String getTitle(){
         return title;
     }

     public String getAuthor(){
         return author;
     }

     public String getIsbn(){
         return isbn;
     }

     public int getPages(){
         return pages;
     }

     public boolean isAvailable(){
         return isAvailable;
     }


     public String borrowBook(){
         if(isAvailable){
             isAvailable = false;
             return "Book borrowed Successfully";
         }
          else{
              return "Book is already borrowed!";
         }
     }

     public String returnBook(){
         if(!isAvailable){
             isAvailable = true;
             return "Book returned Successfully";
         }
          else{
              return "Book is not browed";
         }
     }

     public String BookInfo(){
         return "Title:- " +title+
                 "\nAuthor:- " +author+
                 "\nISBN:- " +isbn+
                 "\nPages:- " +pages+
                 "\nAvailable:- " +(isAvailable ? "Yes" : "No");
     }


     public static void main(String[] args) {

         Book so = new Book("Java Basics","James Gosling" , "12345",350);
         so.BookInfo();

         System.out.println("-------------------Book----------------");
         System.out.println(so.BookInfo());
     }
}
