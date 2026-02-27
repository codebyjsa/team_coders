public class IsWorkingDay {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide a day as command line argument.");
            return;
        }

        String day = args[0].toLowerCase();

        switch(day) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println(day + " is a Working Day.");
                break;

            case "saturday":
            case "sunday":
                System.out.println(day + " is a Holiday.");
                break;

            default:
                System.out.println("Invalid day entered.");
        }
    }
}