package ENCAPSULATIONS;

class Student {
    private String name;
    private int roll_number;
    private double math_grade;
    private double science_grade;
    private double english_grade;

    public Student(String name,int roll_number){
        this.name = name;
        this.roll_number = roll_number;

    }
    public void setMath_grade(double math_grade){
        if((math_grade > 0 ) && (math_grade < 100)){
            this.math_grade = math_grade;
        }
         else{
             System.out.println("Invalid math_grade");
        }
    }
    public void setScience_grade(double science_grade){
       if((science_grade > 0) &&  (science_grade < 100)){
           this.science_grade = science_grade;
       }
        else{
            System.out.print("Invalid Science_grade");
       }
    }

    public void setEnglish_grade(double english_grade){
        if((english_grade > 0) && (english_grade < 100)){
            this.english_grade = english_grade;
        }
         else{
             System.out.println("Invalid Science grade");
        }
    }

    public String getName() {
        return name;
    }

    public int getRoll_number() {
        return roll_number;
    }

    public double getMath_grade() {
        return math_grade;
    }

    public double getScience_grade() {
        return science_grade;
    }

    public double getEnglish_grade() {
        return english_grade;
    }

    public double getAverageGrade(){
        double average_grade = (math_grade + science_grade + english_grade)/3;
        return average_grade;
    }

    public String getLetterGrade() {

        double avg = getAverageGrade();

        if (avg >= 90) return "A";
        else if (avg >= 80) return "B";
        else if (avg >= 70) return "C";
        else if(avg >= 60) return "D";
        else return "F";

    }

    public static void main(String[] args){

        Student s = new Student("Manish",101);

      s.getName();
      s.getRoll_number();
       s.setMath_grade(80);
       s.setScience_grade(70);
       s.setEnglish_grade(90);
      s.getAverageGrade();
      s.getLetterGrade();


      System.out.println("---------Report Card-------------");
      System.out.println("Student Name:- " +s.getName());
      System.out.println("Roll No.:- " +s.getRoll_number());
      System.out.println("Maths Marks:- " +s.getMath_grade());
      System.out.println("Science Marks:- " +s.getScience_grade());
      System.out.println("English Marks:- " +s.getEnglish_grade());
      System.out.println("Average Marks:- " + s.getAverageGrade());
      System.out.println("Grade:- " + s.getLetterGrade());



    }

}
