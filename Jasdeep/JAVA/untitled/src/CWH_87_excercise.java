import java.util.Scanner;

class invalidInput extends Exception{
    @Override
    public String toString() {
        return "Invalid Input";
    }
}
class divideByZeroException extends Exception{
    @Override
    public String toString() {
        return "Cannot divide by zero";
    }
}
class maxInputException extends Exception{
    @Override
    public String toString() {
        return "No input more than 100000";
    }
}
class maxMultiplierException extends Exception{
    @Override
    public String toString() {
        return "Max multiplier cannot be use more than 7000";
    }
}

class customCalculator{
    Scanner sc = new Scanner(System.in);
    int choice;

    public boolean num_error(int a, int b){
        if (a==8 && b==9){
            return true;
        }else {
            return false;
        }
    }
    public boolean max_inp_error(int a, int b){
        if (a>100000 || b>100000){
            return true;
        }else {
            return false;
        }
    }

    public int options() throws invalidInput {
        System.out.println("Welcome to the custom calculator");
        System.out.println("Here are the following options \n1. + \n2. - \n3. * \n4. /");
        System.out.print("Enter which operation do you want to perform by entering the respective number: ");
        choice = sc.nextInt();
        if (choice<1 || choice >4){
            throw new invalidInput();
        }
        return choice;
    }
    public void add(int a, int b) throws invalidInput, maxInputException {
        if(num_error(a, b)){
            System.out.print("Cannot add 8 and 9. ");
            throw new invalidInput();
        } else if (max_inp_error(a, b)) {
            throw new maxInputException();
        } else {
            System.out.println(a + "+" + b + "=" + (a+b));
        }
    }
    public void subtract(int a, int b) throws invalidInput, maxInputException {
        if(num_error(a, b)){
            System.out.print("Cannot add 8 and 9. ");
            throw new invalidInput();
        }else if (max_inp_error(a, b)) {
            throw new maxInputException();
        } else {
            System.out.println(a + "-" + b + "=" + (a-b));
        }
    }
    public void multiply(int a, int b) throws invalidInput, maxInputException, maxMultiplierException {
        if(num_error(a, b)){
            System.out.print("Cannot add 8 and 9. ");
            throw new invalidInput();
        }else if (max_inp_error(a, b)) {
            throw new maxInputException();
        } else if (b>7000) {
            throw new maxMultiplierException();
        } else {
            System.out.println(a + "*" + b + "=" + (a*b));
        }
    }
    public void divide(int a, int b) throws invalidInput, maxInputException, divideByZeroException {
        if(num_error(a, b)){
            System.out.print("Cannot add 8 and 9. ");
            throw new invalidInput();
        }else if (max_inp_error(a, b)) {
            throw new maxInputException();
        } else if (b==0) {
            throw new divideByZeroException();
        } else {
            System.out.println(a + "*" + b + "=" + (a*b));
        }
    }

    public void operation(int a, int b) throws invalidInput, maxInputException, maxMultiplierException, divideByZeroException {
        if (choice==1){
            add(a, b);
        } else if (choice==2) {
            subtract(a, b);
        } else if (choice==3) {
            multiply(a, b);
        }else {
            divide(a, b);
        }
    }
}

public class CWH_87_excercise {
    public static void main(String[] args) throws invalidInput, maxMultiplierException, divideByZeroException, maxInputException {
        customCalculator calc = new customCalculator();

        calc.options();

        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        a= sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();

        calc.operation(a, b);
    }
}
