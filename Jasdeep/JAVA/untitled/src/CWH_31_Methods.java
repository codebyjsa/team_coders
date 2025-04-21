public class CWH_31_Methods {
    int logic(int x, int y){
        int z;
        if (x>y){
            z=x+y;
        }
        else {
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        CWH_31_Methods obj = new CWH_31_Methods();
        int c = obj.logic(5, 6);
    }
}
