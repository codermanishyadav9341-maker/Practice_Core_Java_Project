package Roof_Encapsulation;

public class Movie {
    private String title;
    private String director;
    private int year;
    private double rating;
    private boolean isRented;


    Movie(String title,String director,int year,double rating){
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.isRented = false;
    }


    public String getTitle(){
        return title;
    }

    public String getDirector(){
        return director;
    }

    public int getYear(){
        return year;
    }

    public double getRating(){
        return rating;
    }


    public void rentMovie(){
        if(!isRented){
            isRented = true;
            System.out.println("Rented Movie Successful");
        }
         else{
             System.out.println("Movie is already rented");
        }
    }

    public void returnMovie(){
        if(isRented){
            isRented = false;
            System.out.println("Rented Movie is return");
        }
         else{
             System.out.println("Movie is already Available");
        }
    }

    public void setRating(double rating){
        if(rating >= 1.0  && rating < 10.0){
            this.rating = rating;
        }
         else{
             System.out.println("Invalid rating !Must be rating 1.0 between 10.0");
        }
    }

    public boolean getMovieStatus(){
        return isRented;
    }



    public static void main(String[] args){

        Movie mm = new Movie("RajKumar","Deepak Dildar",2023,9.0);

        System.out.println("------------=:Movie Status:=--------------");
        System.out.println("Title:- " +mm.getTitle());
        System.out.println("Director:- " +mm.getDirector());
        System.out.println("Years:- " +mm.getYear());
        System.out.println("Rating:- " +mm.getRating());
        System.out.println("Available:- " +mm.getMovieStatus());


    }
}
