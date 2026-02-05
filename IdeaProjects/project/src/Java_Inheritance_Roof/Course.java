package Java_Inheritance_Roof;

public class Course {
    String courseName;

    Course(String courseName){
        this.courseName = courseName;
    }

    public void showCourse(){
        System.out.println("Course Name:- " +courseName);
    }
}

class EnrolledStudent extends Course{
    String studentName;
    int roll;

    EnrolledStudent(String courseName,String studentName,int roll){
        super(courseName);
        this.studentName = studentName;
        this.roll = roll;
    }

    public void showCourse(){
        System.out.println("Student Name:- " +studentName);
        System.out.println("Course Name:- " +courseName);
        System.out.println("Roll Number:- " +roll);
    }

    public static void main(String[] args){
        EnrolledStudent ss = new EnrolledStudent("BCA","Manish Yadav",266010);
        ss.showCourse();

    }
}
