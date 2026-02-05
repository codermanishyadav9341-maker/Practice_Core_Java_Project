package Roof_Encapsulation;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private int page;
    private boolean isAvailable;


    Book(String title ,String author,String isbn,int page){
            this.title = title;
            this.author = author;
            this.isbn = isbn;
            this.page = page;
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

    public int getPage(){
        return page;
    }

    public boolean getIsAvailable(){
        return isAvailable;
    }

    public void borrowBook(){
        if(isAvailable){
            isAvailable = false;
        }
         else{
             System.out.println("BorrowBook is Currently not Available");
        }
    }

    public void returnBook(){
        if(!isAvailable){
            isAvailable = true;
        }
         else{
             System.out.println("BorrowBook is  Available");
        }
    }

    public String getBookInfo(){
        return "Title:- " +title+
                "\nAuthor:- " +author+
                "\nIsbn:- " +isbn+
                "\nPages:- " +page+
                "\nAvailable:- " +isAvailable;
    }

    public static void main(String[] args){
        Book bb = new Book("Core Java","Gaurav Kasyap","MNo982105",56);

        System.out.println("-----------------:Book Details:------------------");
        System.out.println(bb.getBookInfo());

    }
}
