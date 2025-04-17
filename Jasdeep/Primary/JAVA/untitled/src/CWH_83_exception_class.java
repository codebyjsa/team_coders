import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am a get message()";
    }
}

public class CWH_83_exception_class {
    public static void main(String[] args) throws ArithmeticException {
        int a = 8;
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        if (a<99){
            //                throw new MyException();
            throw new  ArithmeticException("This is an exception");

        }
    }
}
