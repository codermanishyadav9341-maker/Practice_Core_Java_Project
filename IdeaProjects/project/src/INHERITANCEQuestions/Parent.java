package INHERITANCEQuestions;

class Parent {
    void Father(){
        System.out.println("Parent Constructors Called");
    }
}

 class Child extends Parent{
    void son(){
        System.out.println("Child Constructors Called");
    }
    public static void main(String[] args){

        Child so = new Child();

        so.Father();
        so.son();

    }
 }
