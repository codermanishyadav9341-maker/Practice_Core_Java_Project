package Ecapsulations_Roof;

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

     private void setMathGrade(double newMathGrade){
         if(mathGrade >= 0  && mathGrade < 100){
             mathGrade = newMathGrade;
         }
          else{
              System.out.println("Invalid Marks");
         }
     }

     public void setScienceGrade(double newScienceGrade){
         if(scienceGrade >= 0   && scienceGrade < 100){
             scienceGrade = newScienceGrade;
         }
          else{
              System.out.println("Invalid Marks");
         }
     }

     public void setEnglishGrade(double newEnglishGrade){
         if(englishGrade >= 0 && englishGrade < 100){
             englishGrade = newEnglishGrade;
         }
     }

//        Using getter methods;

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

     public double getAverage(){
         double average = (mathGrade+scienceGrade+englishGrade)/3.0;

         return average;
     }

     public String getLetterGarde(){
         double avg = getAverage();

         if(avg > 90) return "Grade A";
         else if(avg > 80) return "Grade B";
         else if(avg > 70) return "Grade C";
         else if(avg > 60) return "Grade D";
         else return "Grade F";
     }

     public static void main(String[] args) {

         Student so = new Student("Manish Kumar",101);
         so.setMathGrade(80);
         so.setScienceGrade(90);
         so.setEnglishGrade(90);

         System.out.println("-------------:REPORT CARD:-------------");
         System.out.println("Student Name:- " +so.getName());
         System.out.println("RollNo:- " +so.getRollNo());
         System.out.println("Math Marks:- " +so.getMathGrade());
         System.out.println("Science marks:- " +so.getScienceGrade());
         System.out.println("English Marks:- " +so.getEnglishGrade());
         System.out.println("Average Marks:- " +so.getAverage());
         System.out.println(so.getLetterGarde());

     }
}
