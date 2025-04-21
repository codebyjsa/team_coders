class NegativeException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative";
    }
}

public class CWH_84_throw_throws {
    public static double area(int r) throws NegativeException{
        if (r<0){
            throw new  NegativeException();
        }
        double result = Math.PI*r*r;
        return result;
    }

    public static int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        try {
            int c = divide(6, 0);
        } catch (ArithmeticException e) {
            System.out.println("Exception");
        }
        
    }
}
