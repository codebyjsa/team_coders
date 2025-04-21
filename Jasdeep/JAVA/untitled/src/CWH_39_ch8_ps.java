//Problem 1
//class Employee1{
//    int salary;
//    String name ;
//    public int getSalary(){
//        return salary;
//    }
//    public String getName(){
//        return name;
//    }
//    public void setName(String n){
//        name = n;
//    }
//}

//Problem 3
class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

public class CWH_39_ch8_ps {
    public static void main(String[] args) {
//        Problem 1
//        Employee1 jasdeep = new Employee1();
//        jasdeep.setName("Code byjsa");
//        System.out.println(jasdeep.getName());

//        problem 3
        square sq = new square();
        sq.side=4;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}
