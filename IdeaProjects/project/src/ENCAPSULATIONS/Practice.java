package ENCAPSULATIONS;

public class Practice {

    private String name;
    private int roll_No;
    private double math_Marks;
    private double science_Marks;
    private double english_Marks;

//    Using Constructors;

    public Practice(String name,int roll_No){
        this.name = name;
        this.roll_No = roll_No;
    }

//    Using Setter Methods;

    public void setMath_Marks(double newMath_Marks){
        if(math_Marks >= 0 && math_Marks <= 100){
            this.math_Marks = newMath_Marks;
        }
         else{
             System.out.println("Invalid Marks between 0 or 100");
        }
    }

    public void setEnglish_Marks(double english_Marks){
        if(english_Marks >= 0 && english_Marks <= 100){
            this.english_Marks = english_Marks;
        }
         else{
             System.out.println("Invalid Marks! must be between 0 and 100");
        }
    }

    public void setScience_Marks(double science_Marks){
        if(science_Marks >= 0 && science_Marks <= 0){
            this.science_Marks = science_Marks;
        }
        else{
            System.out.println("Invalid Marks! must be between 0 and 100");
        }
    }

//     Using Getter methods;

    public String getName(){
        return name;
    }
    public int getRoll_No(){
        return roll_No;
    }

    public double getMath_Marks() {
        return math_Marks;
    }

    public double getEnglish_Marks() {
        return english_Marks;
    }

    public double getScience_Marks() {
        return science_Marks;
    }

    public double getAverage(){
        return (math_Marks + english_Marks +science_Marks)/3.0;
    }

    public String getGrade(){
        double avg = getAverage();
        if(avg >= 90) return "A";
        else if(avg >= 80) return "B";
        else if(avg >= 70) return "c";
        else if(avg >= 60) return "D";
        else return "f";
    }

    public String getStudentDetails(){
        return "Name:- " +name+
                "\nRoll no:- " +roll_No+
                "\nMathMarks:- " +math_Marks+
                "\nEnglishMarks:- " +english_Marks+
                "\nScienceMarks:- " +science_Marks+
                "\nAverage:- " +getAverage()+
                "\nGrade:- " +getGrade();
    }

    public static void main(String[] args) {

        Practice so = new Practice("Manish",101);
        so.setMath_Marks(50);
        so.setEnglish_Marks(70);
        so.setScience_Marks(65);

        so.getStudentDetails();
        System.out.println("---------Report Card-----------");
        System.out.println( so.getStudentDetails());
    }
}
