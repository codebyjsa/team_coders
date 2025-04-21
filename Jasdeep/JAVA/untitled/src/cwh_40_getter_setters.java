class myEmployee{
    private int id;
    private String name;

    public int getId() {
        return id;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id = i;
    }
    public String getName(){
        return  name;
    }
}

public class cwh_40_getter_setters {
    public static void main(String[] args) {
        myEmployee harry = new myEmployee();
//        harry.id = 45;
//        harry.name = "codeWithHarry";
        harry.setName("CodeWithHarry");
        System.out.println(harry.getName());
    }
}
