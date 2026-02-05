package Java_Encapsulations;

 class Book {
     private String title;
     private String author;
     private String iSBN;
     private int pages;
     private boolean isAvailable;

//      Using Constructor;

     Book(String title,String author,String iSBN,int pages){
               this.title = title;
               this.author = author;
               this.iSBN = iSBN;
               this.pages = pages;
               this.isAvailable = true;
     }

     public String getTitle(){
         return title;
     }

     public String getAuthor(){
         return author;
     }

     public String getISBN(){
         return iSBN;
     }

     public int getPages(){
         return pages;
     }

     public boolean getIsAvailable(){
         return isAvailable;
     }

     public boolean borrowBook(){
         if(isAvailable){
             isAvailable = false;
             return true;
         }
          else{
              System.out.println("borrowBook is not Available");

              return false;
         }


     }

     public boolean returnBook(){
         if(!isAvailable)
            isAvailable = true;
         return true;
     }

     public String getBookInfo(){
         return "Title:- " +title+
                 "\nAuthor:- " +author+
                 "\nISBN:- " +iSBN+
                 "\nPages:- " +pages+
                 "\nISAvailable:- " +isAvailable;
     }

     public static void main(String[] args){
         Book bo = new Book("Java","Gaurav","sp3",450);
         bo.getBookInfo();

         System.out.println(bo.getBookInfo());

     }
}
