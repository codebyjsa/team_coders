
class student {

    //Attributes
    int rollNo ;
    String name;
    int marks;

    //constructor
    student (int rollNo, String name, int marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    //Methods
    void display(){
        System.out.println("Roll no: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

}

public class exp9 {
    public static void main(String[] args) {

        student s1 = new student(1, "Jasdeep", 20);

        s1.display();

    }
}
