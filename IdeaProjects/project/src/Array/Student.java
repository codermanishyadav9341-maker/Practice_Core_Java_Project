package Array;

class Student {

    String name;
    int age;

    Student(String name,int age){
        this.name =name;
        this.age = age;
    }

    public static void main(String[] args) {


        Student[] s1 = {
                new Student("Manish",22),
                new Student("Vishal",23),
                new Student("Ankit",20)

        };

        System.out.println(s1[1].name);























//        Student[] s1 = new Student[3];
//
////        s1[0] = new Student("Manish",20);
////        s1[1] = new Student("Ronit",21);
////        s1[2] = new Student("Vishal",20);
////
////        System.out.println(" Name:- " +s1[0]);
////        System.out.println("Student Name:- " +s1[1]);
////        System.out.println("Student Name:- " +s1[2]);
//
//        String[] Student;
//        Student[3] = ("Manish",20);
//    }
    }
}
