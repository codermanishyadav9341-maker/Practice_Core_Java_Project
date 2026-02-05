package Java_Inheritance_Roof;

public class College {
    String collegeName;

    College(String collegeName){
        this.collegeName = collegeName;
    }

}

class Admission extends College{
    String studentName;
    String course;

    Admission(String collegeName,String studentName,String course){
        super(collegeName);
        this.studentName = studentName;
        this.course = course;
    }

    public void display(){
        System.out.println("College Name:- " +collegeName);
        System.out.println("Student Name:- " +studentName);
        System.out.println("Course:- " +course);

    }

    public static void main(String[] args){

        Admission aa = new Admission("Smta College","Manish Yadav","BCA");
        aa.display();
    }
}
