public class CWH_18_switch {
    public static void main(String[] args) {
        int age=6;

        switch (age){
            case 18:
                System.out.println("You are adult!");
                break;

            case 10:
                System.out.println("You are child!");
                break;

            default:
                System.out.println("Enjoy your life :)");
                break;
        }
    }
}
