package Inheritance1;

class School {
    void showSchool(String school_Name){
        System.out.println("School Name:- " +school_Name);
    }
}

class Teacher extends School{
    void showTeacherDetails(String teacher_Name){
        System.out.println("Teacher name:- " +teacher_Name);
    }

    public static void main(String[] args){

        Teacher so = new Teacher();
        so.showSchool("Coding Age");
        so.showTeacherDetails("Mr. Gaurav Kasyap");

    }
}
