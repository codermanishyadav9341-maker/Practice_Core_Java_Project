package ENCAPSULATIONS;

public class Films {
    private String movie_Name;
    private String Actors_Name;
    private String Actress;
    private String produced_Name;
    private String director_name;
    private String director_Photography;
    private String film_Industry_Name;
    private String projected_Supervisor;
    private String music;
    private String lyrics;
    private String associate_Director;
    private String story_Writer_Name;
    private String Editor_Name;
    private String dl_Colorist;
    private String Sound_Designers;
    private String promos;
    private String choreographer;
    private String background_Score;
    private String costume;
    private String pro;
    private String publicity_Designers;
    private String executive_Producers;
    private String production_Executive;
    private String banner;
    private String music_On;



//      Using Setter methods;

    public void setMovie_Name(String newMovie_Name){
        movie_Name = newMovie_Name;
    }

    public void setActors_Name(String newActors_Name){
        Actors_Name = newActors_Name;
    }

    public void setActress(String newActress){
        Actress = newActress;
    }

    public void setProduced_Name(String newProduced_Name){
        produced_Name = newProduced_Name;
    }

    public void setDirector_name(String newDirector_name){
        director_name = newDirector_name;
    }

    public void setDirector_Photography(String newDirector_Photography){
        director_Photography = newDirector_Photography;
    }

    public void setFilm_Industry_Name(String newFilm_Industry_Name){
        film_Industry_Name = newFilm_Industry_Name;
    }

    public void setProjected_Supervisor(String newProjected_Supervisor){
        projected_Supervisor = newProjected_Supervisor;
    }

    public void setMusic(String newMusic){
        music = newMusic;
    }

    public void setLyrics(String newLyrics){
        lyrics = newLyrics;
    }

    public void setAssociate_Director(String newAssociate_Director){
        associate_Director = newAssociate_Director;
    }

    public void setStory_Writer_Name(String newStory_Writer_Name){
        story_Writer_Name = newStory_Writer_Name;
    }

    public void setEditor_Name(String newEditor_Name){
        Editor_Name = newEditor_Name;
    }

    public void setDl_Colorist(String newDl_Colorist){
        dl_Colorist = newDl_Colorist;
    }

    public void setSound_Designers(String newSound_Designers){
        Sound_Designers = newSound_Designers;
    }

    public void setPromos(String newPromos){
        promos = newPromos;
    }

    public void setChoreographer(String newChoreographer){
        choreographer = newChoreographer;
    }

    public void setBackground_Score(String newBackground_Score){
        background_Score = newBackground_Score;
    }

    public void setCostume(String newCostume){
        costume = newCostume;
    }

    public void setPro(String newPro){
        pro = newPro;
    }

    public void setPublicity_Designers(String newPublicity_Designers){
        publicity_Designers = newPublicity_Designers;
    }

    public void setExecutive_Producers(String newExecutive_Producers){
        executive_Producers = newExecutive_Producers;
    }

    public void setProduction_Executive(String newProduction_Executive){
        production_Executive = newProduction_Executive;
    }

    public void setBanner(String newBanner){
        banner = newBanner;

    }

    public void setMusic_On(String newMusic_On){
        music_On = newMusic_On;
    }

//     Using Getter methods;

    public String getMovie_Name(){
        return movie_Name;
    }

    public String getActors_Name(){
        return Actors_Name;
    }

    public String getActress(){
        return Actress;
    }

    public String getProduced_Name(){
        return produced_Name;
    }

    public String getDirector_name(){
        return director_name;
    }

    public String getDirector_Photography(){
        return director_Photography;
    }

    public String getFilm_Industry_Name(){
        return film_Industry_Name;
    }

    public String getProjected_Supervisor(){
        return projected_Supervisor;
    }

    public String getMusic(){
        return music;
    }

    public String getLyrics(){
        return lyrics;
    }

    public String getAssociate_Director(){
        return associate_Director;
    }

    public String getStory_Writer_Name(){
        return story_Writer_Name;
    }

    public String getEditor_Name(){
        return Editor_Name;
    }

    public String getDl_Colorist(){
        return dl_Colorist;
    }

    public String getSound_Designers(){
        return Sound_Designers;
    }

    public String getPromos(){
        return promos;
    }

    public String getChoreographer(){
        return choreographer;
    }

    public String getBackground_Score(){
        return background_Score;
    }

    public String getCostume(){
        return costume;
    }

    public String getPro(){
        return pro;
    }

    public String getPublicity_Designers(){
        return publicity_Designers;
    }

    public String getExecutive_Producers(){
        return executive_Producers;
    }

    public String getProduction_Executive(){
        return production_Executive;
    }

    public String getBanner(){
        return banner;
    }

    public String getMusic_On(){
        return music_On;
    }

    public static void main(String[] args) {

        Films so = new Films();

        so.setMovie_Name("Payar Kiya To Nibhana");
        so.setActors_Name("Khesari Lal Yadav");
        so.setActress("Kajal Raghwani");
        so.setProduced_Name("Abhay Singh,Ranjeet Singh, Prashant Singh");
        so.setDirector_name("Rajnish Mishra");
        so.setDirector_Photography("Vasu");
        so.setFilm_Industry_Name("Yashi Films Creative");
        so.setProjected_Supervisor("Prashant Shelke");
        so.setMusic("Rajnish Mishra");
        so.setLyrics("Ashutosh Tiwari, Ajit Halchal, Rajnish Mishra");
        so.setAssociate_Director("Kumardev Singh Jyoti");
        so.setStory_Writer_Name("Rajnish Mishra");
        so.setEditor_Name("Harish Chaudary");
        so.setDl_Colorist("Deepak Shah");
        so.setSound_Designers("Dheeraj Poojary");
        so.setPromos("Umesh Mishra");
        so.setChoreographer("Sanjay korve, Sanjeev Sharma");
        so.setBackground_Score("Shekhar Singh");
        so.setCostume("Badshah Khan");
        so.setPro("Ranjan Sinha - Sarvesh Kasyap");
        so.setPublicity_Designers("Narsu");
        so.setExecutive_Producers("Anil kumar Singh , MD Hasamu Khan");
        so.setProduction_Executive("Prabhav Chaturvedi , Sagar");
        so.setBanner("Yashi Films Pvt. Ltd. Presents,Zabawa Entertainments Pvt Ltd");
        so.setMusic_On("Enter10 Rangeela");


        System.out.println("------------All Characters Appearing In This Films-----------");
        System.out.println("Movie Name:- " +so.getMovie_Name());
        System.out.println("Actors Name:- " +so.getActors_Name());
        System.out.println("Actress Name:- " +so.getActress());
        System.out.println("Produced Name:- " +so.getProduced_Name());
        System.out.println("Director Name:- " +so.getDirector_name());
        System.out.println("Film Industry Name:- " +so.getFilm_Industry_Name());
        System.out.println("Projected Supervisor:- " +so.getProjected_Supervisor());
        System.out.println("Music:- " +so.getMusic());
        System.out.println("Lyrics:- " +so.getLyrics());
        System.out.println("Associate Directors:- " +so.getAssociate_Director());
        System.out.println("Story Writer Name:- " +so.getStory_Writer_Name());
        System.out.println("Editior Name:- " +so.getEditor_Name());
        System.out.println("Dl Colorist:- " +so.getDl_Colorist());
        System.out.println("Sound Designers:- " +so.getSound_Designers());
        System.out.println("Promos:- " +so.getPromos());
        System.out.println("Choreographer:- " +so.getChoreographer());
        System.out.println("BackGround Series:- " +so.getBackground_Score());
        System.out.println("Costume:- " +so.getCostume());
        System.out.println("PRO:- " +so.getPro());
        System.out.println("Publicity Designers:- " +so.getPublicity_Designers());
        System.out.println("Executive Producers:- " +so.getExecutive_Producers());
        System.out.println("Production Executive:- " +so.getProduction_Executive());
        System.out.println("Banners:- " +so.getBanner());
        System.out.println("Music On:- " +so.getMusic_On());




    }
}