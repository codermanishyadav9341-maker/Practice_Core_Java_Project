package Java_Inheritance;

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
    int shiftNumber;

    LibraryBook(String title,String author,int shiftNumber){
        super(title,author);
        this.shiftNumber = shiftNumber;
    }

    public void showDetails(){
        System.out.println("Titles:- " +title);
        System.out.println("Author:- " +author);
        System.out.println("ShiftNumber:- " +shiftNumber);

    }
    public static void main(String[] args){
        LibraryBook so = new LibraryBook("Java Basics","John smith",105);
        so.showDetails();
    }
}
