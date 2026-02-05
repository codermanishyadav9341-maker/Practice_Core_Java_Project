package ENCAPSULATIONS;

 class Movie{


//      Using Private Keywords;

     private String title;
     private String director;
     private int years;
     private double rating;
     private boolean isRented;


//      Constructors;

     public Movie(String title,String director,int years,double rating){

         this.title = title;
         this.director = director;
         this.years = years;
         this.rating = rating;
         this.isRented = false;

     }

//     Using getter methods;

     public String getTitle(){
         return title;
     }

     public String getDirector(){
         return director;
     }

     public int getYears(){
         return years;
     }

     public double getRating(){
         return rating;
     }

     public boolean getIsRented(){
         return isRented;
     }

//     makes methods rentMovie;

     public void rentMovie(){
         if(!isRented){
             isRented = true;
             System.out.println(title+ " is rented movie");
         }
          else{
              System.out.println("Movie cannot fine");
         }
     }

     public void setRating(double newRating){
         if(newRating >= 1.0   && newRating <= 10.0){
             rating = newRating;
         }
          else{
              System.out.println("Invalid rating");
         }
     }

     public String getMovieStatus(){
         return  isRented ? "Available" : " Rented";
     }

     public static void main(String[] args){

         Movie so = new Movie("Coder","Mr. Gaurav Kasyap",2025,9.5);
         so.getMovieStatus();
         so.getDirector();
         so.rentMovie();
         so.getIsRented();
         so.getTitle();
         so.setRating(10.5);
         so.getRating();



         System.out.println("----------Movie Details-----------");
         System.out.println("Director Name:- " + so.getDirector());
         System.out.println("Movie titles:- " +so.getTitle());
         System.out.println("Years:- " +so.getYears());
         System.out.println("Rating:- " +so.getRating());
         System.out.println("Status:- " + so.getMovieStatus());





     }
}