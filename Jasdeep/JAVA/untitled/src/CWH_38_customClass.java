class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is "+ id);
        System.out.println("and my name is "+ name);
    }
    public int getSalary(){
        return salary;
    }
}

public class CWH_38_customClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee harry = new Employee();
        Employee john = new Employee();
        harry.id= 12;
        harry.name="CodeWithHarry";
        harry.salary = 34000;
        john.id = 17;
        john.name = "John Tripathi";
        john.salary = 50000;
//        System.out.println(harry.id);
//        System.out.println(harry.name);
        harry.printDetails();
        john.printDetails();
        int salary = harry.getSalary();
        System.out.println(salary);
    }
}
