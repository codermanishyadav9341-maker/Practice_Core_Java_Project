package Java_Inheritance;

class College {
    String collegeName;

    College(String collegeName){
        this.collegeName = collegeName;
    }

}

class Admission extends College{
    String name;
    String course;

    Admission(String collegeName,String name,String course){
        super(collegeName);
        this.name = name;
        this.course = course;
    }

    public void display(){
        System.out.println("College Name:- " +collegeName);
        System.out.println("Student Name:- " +name);
        System.out.println("Course:- " +course);
    }

    public static void main(String[] args){
        Admission ad = new Admission("RPS College Mahnar","Manish Yadav","BCA");
        ad.display();
    }
}
