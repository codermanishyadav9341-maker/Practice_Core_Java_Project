package Encapsulations_Practice;

class Movie {
    private String title;
    private String directors;
    private int years;
    private double rating;
    private boolean isRented;


    Movie(String title,String directors,int years,double rating){
        this.title = title;
        this.directors = directors;
        this.years = years;
        this.rating = rating;
        this.isRented = false;
    }

    public String getTitle(){
        return title;
    }

    public String getDirectors(){
        return directors;
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

    public void rentMovie(){
        if(!isRented){
            isRented = true;
            System.out.println("Movie rented Successfully");
        }
         else{
             System.out.println("Movie is already rented");
        }
    }

    public void returnMovie(){
        if(isRented){
            isRented = false;
            System.out.println("Movie returned");
        }
         else{
              System.out.println("Movie is not rented");
        }

    }

    public void setRating(double newRating){
        if(newRating >= 1.0   && newRating <= 10.0){
            this.rating = newRating;
        }

    }

    public String getMovieStatus(){
        return "Title:- " +title+
                "\nDirectors:- " +directors+
                "\nYears:- " +years+
                "\nRating:- " +rating+
                "\nMovie Available:- " +(isRented ? "Yes" : "No");
    }

    public static void main(String[] args){

        Movie so = new Movie("Dulhe Raja","Gaurav Kasyap",2025,555.23);
        so.setRating(1000.50);

        System.out.println("---------Movie Features--------");
        System.out.println(so.getMovieStatus());
    }
}
