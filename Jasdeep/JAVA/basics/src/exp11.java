
class Student {
    String name;
    int age;

    // Constructor using 'this' keyword
    Student(String name, int age) {
        this.name = name;   // refers to current object's variable
        this.age = age;
    }

    // Method using 'this' keyword
    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    // Method to compare two objects using 'this'
    void compare(Student s) {
        if (this.age > s.age) {
            System.out.println(this.name + " is older than " + s.name);
        } else if (this.age < s.age) {
            System.out.println(this.name + " is younger than " + s.name);
        } else {
            System.out.println(this.name + " and " + s.name + " are of same age");
        }
    }
}

public class exp11 {
    public static void main(String[] args) {

        Student s1 = new Student("Jasdeep", 20);
        Student s2 = new Student("Rahul", 22);

        s1.display();
        s2.display();

        System.out.println("------------------");

        s1.compare(s2);
    }
}
