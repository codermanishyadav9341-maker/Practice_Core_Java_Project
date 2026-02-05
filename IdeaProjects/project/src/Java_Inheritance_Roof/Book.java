package Java_Inheritance_Roof;

public class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void showDetails() {
        System.out.println("Titles:- " + title);
        System.out.println("Author:- " + author);
    }

}
    class Library extends Book{
        double shelfNumber;

        Library(String title,String author,double shelfNumber){
            super(title,author);
            this.shelfNumber = shelfNumber;
        }

        public void showDetails(){
            System.out.println("Title:- " +title);
            System.out.println("Author:- " +author);
            System.out.println("ShelfNumber:- " +shelfNumber);
        }

        public static void main(String[] args){
            Library aa = new Library("Java Basics","John Smith",5);
            aa.showDetails();

        }
    }

