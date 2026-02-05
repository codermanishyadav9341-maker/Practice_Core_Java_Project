

class Student {
    private String name;
    private int rollNo;
    private double mathGrade;
    private double scienceGrade;
    private double englishGrade;


    Student(String name,int rollNo){
        this.name = name;
        this.rollNo = rollNo;

    }

//       Using Setter Methods;

    public void setMathGrade(double newMathGrade){
        if(mathGrade >= 0  && mathGrade < 100){
            mathGrade = newMathGrade;
        }
         else{
             System.out.println("Invalid");
        }
    }

    public void setScienceGrade(double newScienceGrade){
        if(scienceGrade >= 0 && scienceGrade < 100){
            scienceGrade = newScienceGrade;
        }
         else{
             System.out.println("Invalid Marks");
        }
    }

    public void setEnglishGrade(double newEnglishGrade){
        if(englishGrade >= 0  && englishGrade < 100){
            englishGrade = newEnglishGrade;
        }
         else{
             System.out.println("Invalid Marks ");
        }
    }

//     Using getter methods ;

    public String getName(){
        return name;
    }

    public int getRollNo(){
        return rollNo;
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

//     Get Average marks;

    public double getAverage(){
        return (mathGrade + scienceGrade + englishGrade)/3.0;
    }

    public String getGrade(){

        double avg = getAverage();
        if(avg >= 90)  return "Grade A";
               else if(avg >= 80) return "Garde:-  B";
               else if(avg >= 70) return "Grade:-  C";
               else if(avg >= 60) return "Grade:-  D";
               else return "F";
    }


    public static void main(String[] args){

        Student so = new Student("Manish",101);
        so.setMathGrade(80);
        so.setScienceGrade(60);
        so.setEnglishGrade(90);
        so.getName();
        so.getRollNo();


        System.out.println("---------Report Card---------------");
        System.out.println("Student Name:- " +so.getName());
        System.out.println("Roll number:- " +so.getRollNo());
        System.out.println("MathMarks:- " +so.getMathGrade());
        System.out.println("ScienceMarks:- " +so.getScienceGrade());
        System.out.println("EnglishMarks:- " +so.getEnglishGrade());
        System.out.println("Average Marks:- " +so.getAverage());
        System.out.println(so.getGrade());


    }
}
