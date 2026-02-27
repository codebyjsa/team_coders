import javax.management.MBeanAttributeInfo;

class StudentData{
    String studentName;
    int URN;
    int CRN;

    public StudentData(String name, int urn, int crn) {
        this.studentName=name;
        this.URN=urn;
        this.CRN=crn;
    }

}

public class basics1 {
    public static void main(String[] args) {

        StudentData s = new StudentData("Jasdeep", 24, 65);

        System.out.println(s.studentName);
        System.out.println(s.CRN);
        System.out.println(s.URN);

    }

}
