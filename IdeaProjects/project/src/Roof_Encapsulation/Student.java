package Roof_Encapsulation;

public class Student {
    private String name;
    private int rollNumber;
    private double mathGrade;
    private double scienceGrade;
    private double englishGrade;


    Student(String name ,int rollNumber,double mathGrade,double scienceGrade,double englishGrade){
        this.name = name;
        this.rollNumber = rollNumber;
        setMathGrade(mathGrade);
        setScienceGrade(scienceGrade);
        setEnglishGrade(englishGrade);
    }

    public void setMathGrade(double mathGrade){
        if(mathGrade >= 0 && mathGrade <= 100){
            this.mathGrade = mathGrade;
        }
         else{
             System.out.println("Subject Marks Must ! 0 and 100");
        }

    }

    public void setScienceGrade(double scienceGrade){
        if(scienceGrade >= 0 && scienceGrade <= 100){
            this.scienceGrade = scienceGrade;
        }
         else{
             System.out.println("Marks must be ! 0 and 100");
        }
    }

    public void setEnglishGrade(double englishGrade){
        if(englishGrade >= 0 && englishGrade <= 100){
            this.englishGrade = englishGrade;
        }
         else{
             System.out.println("Marks must be ! 0 and 100");
        }
    }

    public String getName(){
        return name;
    }

    public int getRollNumber(){
        return rollNumber;
    }

    public double getMathGrade(){
        return mathGrade;
    }

    public double getScienceGrade(){
        return scienceGrade;
    }

    public double getEnglishGrade(){
        return englishGrade;
    }

    public double getTotalMarks(){
        return (mathGrade + scienceGrade + englishGrade);
    }
    public double getAverageMarks(){
        double avgerage = (mathGrade + scienceGrade +englishGrade)/3.0;
        return avgerage;
    }

    public String getLetterGrade(){
        double avg = getAverageMarks();
        if(avg >= 90) return "A";
        else if(avg >= 80) return "B";
        else if(avg >= 70) return "C";
        else if(avg >= 60) return "D";
        else return "fail";
    }

    public static void main(String[] args){
        Student ss = new Student("Manish Yadav",255056,75,86,89);

        System.out.println("----------------:Report Card:-----------------");
        System.out.println("Student Name:- " +ss.getName());
        System.out.println("Roll Number:- " +ss.getRollNumber());
        System.out.println("MathMarks:- " +ss.getMathGrade());
        System.out.println("ScienceMarks:- " +ss.getScienceGrade());
        System.out.println("EnglishMarks:- " +ss.getEnglishGrade());
        System.out.println("Total Marks:- " +ss.getTotalMarks());
        System.out.println("Average Marks:- " +ss.getAverageMarks());
        System.out.println("Grade:- " +ss.getLetterGrade());


    }
}
