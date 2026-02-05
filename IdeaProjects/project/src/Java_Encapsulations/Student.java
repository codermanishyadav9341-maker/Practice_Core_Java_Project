package Java_Encapsulations;

 class Student {
     private String name;
     private int rollNo;
     private double mathGrade;
     private double scienceGrade;
     private double englishGrade;

//     Using Constructor;

     Student(String name,int rollNo,double mathGrade, double scienceGrade,double englishGrade){
         this.name = name;
         this.rollNo = rollNo;
         this.mathGrade = mathGrade;
         this.scienceGrade = scienceGrade;
         this.englishGrade = englishGrade;
     }

     public void setMathGrade(){
         if(mathGrade >= 0 && mathGrade < 100){
             this.mathGrade = mathGrade;
         }
          else{
              System.out.println("Grade cannot Negative");
         }
     }

     public void setScienceGarde(){
         if(scienceGrade >= 0 && scienceGrade < 100){
             this.scienceGrade = scienceGrade;
         }
          else{
              System.out.println("Grade Cannot negative");
         }
     }

     public void setEnglishGrade(){
         if(englishGrade >= 0 && englishGrade < 100){
             this.englishGrade = englishGrade;
         }
          else{
              System.out.println("Grade Cannot negative");
         }
     }

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

     public double getAverageGrade(){
         return (mathGrade + scienceGrade +englishGrade)/3.0;
     }

     public double getTotalMarks(){
         double total_Marks = (mathGrade+scienceGrade+englishGrade);
         return total_Marks;
     }


     public String getLetterGrade(){
         double avg = getAverageGrade();
         if(avg >= 90)  return "A";
         else if(avg >= 80) return "B";
         else if(avg >= 70) return "C";
         else if(avg >= 60) return "D";
         else return "F";

     }

     public static void main(String[] args){
         Student so = new Student("Manish Yadav",101,96,75,89);
         so.getName();
         so.getRollNo();
         so.getMathGrade();
         so.getScienceGrade();
         so.getEnglishGrade();
         so.getAverageGrade();
         so.getTotalMarks();
         so.getLetterGrade();

         System.out.println("-----------------:Report Card:----------------");
         System.out.println("Student Name:- " +so.getName());
         System.out.println("Roll No:- " +so.getRollNo());
         System.out.println("MathsGrade:- " +so.getMathGrade());
         System.out.println("Science Grade:- " +so.getScienceGrade());
         System.out.println("English Grade:- " +so.getEnglishGrade());
         System.out.println("Total Marks:- " +so.getTotalMarks());
         System.out.println("Average Marks:- " +so.getAverageGrade());
         System.out.println("Grade:- " +so.getLetterGrade());


     }
}
