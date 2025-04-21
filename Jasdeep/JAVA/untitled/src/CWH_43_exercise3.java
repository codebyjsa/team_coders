import java.util.Scanner;
import java.util.Random;

class guessGame{
    public int a, b, c=0;
    public Scanner sc = new Scanner(System.in);

    public int randomNumber(){
        Random random = new Random();
        a=random.nextInt(1,101);
        return a;
    }

    public void takeUserInput(){
        System.out.print("Enter a number is between 1 to 100: ");

        do {
            b=sc.nextInt();
            if (b>a){
                System.out.println("You entered a bigger number!");
            } else if (b<a) {
                System.out.println("You entered a smaller number!");
            }
            c++;
        }while (a!=b);

    }
    public void isCorrectNumber(){
        System.out.println("Number of times you guessed a number: "+ c);
        if (c<=3){
            System.out.println("You are a pro player!");
        }else if (c>3 && c<=7){
            System.out.println("You are a good player!");
        }else {
            System.out.println("You can do it better!");
        }
    }
}

public class CWH_43_exercise3 {
    public static void main(String[] args) {
        guessGame game = new guessGame();
        game.randomNumber();
        game.takeUserInput();
        game.isCorrectNumber();
    }
}
