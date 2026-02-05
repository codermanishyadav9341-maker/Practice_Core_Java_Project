package ENCAPSULATIONS;

class Book {

//     Using private Keywords;

    private String title;
    private String author;
    private String isbn;
    private int pages;
    private boolean isAvailable;

//      Using Constructor;

    public Book(String title, String author,String isbn ,int pages){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.pages = pages;
    }

//    Using Getter Method ;

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

    public boolean getIsAvailable(){
        return isAvailable;
    }

//     -------Brown Book Method---------
    public boolean brownBook(){
        if(isAvailable){
            isAvailable = false;
            System.out.println(title+ " Browned Successfully");
            return true;
        }
         else{
             System.out.println(title+ " Already brown.    Cannot brown again!");
        }
         return false;
    }

//     ---------Return Book Method-----------

    public boolean returnBook(){
        if(!isAvailable){
            isAvailable = true;
            System.out.println(title+ " Returned Successfully");
           return true;
        }
         else{
             System.out.println(title+ " is not brown");
             return false;

        }
    }

    public String getBookInfo(){
        return "Title:- " +title+
                "\nAuthor:- " +author+
                "\nISBN:- " +isbn+
                "\nPages:- " +pages+
                "\nAvailable:- " +(isAvailable ?  " Yes"  : " No");
    }

    public static void main(String[] args) {
        Book b = new Book("Java Programming" , "James Gosling" , "ISBN12345",450);

        b.getAuthor();
        b.getBookInfo();
        b.brownBook();
        b.getIsAvailable();
        b.getIsbn();
        b.getPages();
        b.getTitle();
        b.returnBook();

        System.out.println("-------Book Class--------");
        System.out.println("Title:- " +b.getTitle());
        System.out.println("Author:- " +b.getAuthor());
        System.out.println("ISBN Code:- " +b.getIsbn());
        System.out.println("Pages No.:- " + b.getPages());
        System.out.println("Book Available:- " + b.getIsAvailable());
    }

}
