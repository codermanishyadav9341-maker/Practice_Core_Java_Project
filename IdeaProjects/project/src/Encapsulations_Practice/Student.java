package Encapsulations_Practice;

 class Student {
     private String name;
     private int rollNumber;
     private  double mathGrade;
     private double scienceGrade;
     private double englishGrade;


     Student(String name,int rollNumber){
         this.name = name;
         this.rollNumber = rollNumber;
         this.mathGrade = mathGrade;
         this.scienceGrade = scienceGrade;
         this.englishGrade = englishGrade;
     }

     public void setMathGrade(double NewMathMarks){
         if(NewMathMarks >= 0 && NewMathMarks <= 100){
             this.mathGrade = NewMathMarks;
         }
          else{
              System.out.println("Marks is not negative");
         }
     }

     public void setScienceGrade(double NewScienceMarks){
         if(NewScienceMarks >= 0 && NewScienceMarks<= 100){
             this.scienceGrade = NewScienceMarks;
         }
          else{
              System.out.println("Marks is not negative");
         }
     }

     public void setEnglishGrade(double NewEnglishMarks){
         if(NewEnglishMarks >= 0 && NewEnglishMarks <= 100){
             this.englishGrade = NewEnglishMarks;
         }
          else{
              System.out.println("Marks is not negative");
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

     public double getAverage(){

         double totalMarks = (mathGrade+scienceGrade+englishGrade);

         return totalMarks/3.0;
     }

     public String getGrade(){
         double avg = getAverage();

         if(avg >= 90) return " A";
         else if(avg >= 80) return " B";
         else if(avg >= 70) return " C";
         else if(avg >= 60) return "Grade D";
         else return "Fails";
     }

     public static void main(String[] args){

         Student so = new Student("Manish Yadav",101);
         so.setMathGrade(95);
         so.setScienceGrade(85);
         so.setEnglishGrade(86);
         so.getAverage();
         so.getGrade();


         System.out.println("---------Report Card--------");
         System.out.println("Name:- " +so.getName());
         System.out.println("Roll Number:- " +so.getRollNumber());
         System.out.println("MathMarks:- " +so.getMathGrade());
         System.out.println("ScienceMarks:- " +so.getScienceGrade());
         System.out.println("EnglishMarks:- " +so.getEnglishGrade());
         System.out.println("Total Marks:- " +so.getAverage());
         System.out.println("Grade:- " +so.getGrade());
     }
}
