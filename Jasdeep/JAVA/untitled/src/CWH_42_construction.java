class myMainEmployee{
    private int id;
    private String name;

        public myMainEmployee(String myName, int myid){
        id=myid;
        name = myName;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId (int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}

public class CWH_42_construction {
    public static void main(String[] args) {
        myMainEmployee harry = new myMainEmployee("Jasdeep", 33);
//        harry.setName("codewithharry");
//        harry.setId(44);

        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}
