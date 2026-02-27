public class exp4 {
    public static void main(String[] args) {
        System.out.println("Type Casting and Operator Precedence");
        
        // Type Casting
        System.out.println("\n--- Type Casting ---");
        
        // int to double (automatic)
        int num = 10;
        double dec = num;
        System.out.println("int 10 to double: " + dec);
        
        // double to int (manual)
        double price = 19.99;
        int intPrice = (int) price;
        System.out.println("double 19.99 to int: " + intPrice);
        
        // Operator Precedence
        System.out.println("\n--- Operator Precedence ---");
        
        // Multiplication before addition
        int result1 = 5 + 3 * 2;
        System.out.println("5 + 3 * 2 = " + result1); // 11 (not 16)
        
        // Parentheses change order
        int result2 = (5 + 3) * 2;
        System.out.println("(5 + 3) * 2 = " + result2); // 16
        
        // Complex example
        int result3 = 10 + 5 * 2 - 8 / 4;
        System.out.println("10 + 5 * 2 - 8 / 4 = " + result3); // 19
        
        // With parentheses
        int result4 = (10 + 5) * (2 - 8) / 4;
        System.out.println("(10 + 5) * (2 - 8) / 4 = " + result4); // -22
        
        System.out.println("Done!");
    }
}
