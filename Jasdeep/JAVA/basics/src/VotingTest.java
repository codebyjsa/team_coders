

public class VotingTest {

    int VOTING_AGE = 18;

    public void canVote(int age) {
        if (age >= VOTING_AGE) {
            System.out.println("Can Vote");
        } else {
            System.out.println("Cannot Vote");
        }
    }

    public static void main(String[] args) {
        VotingTest vt = new VotingTest();

        int age = Integer.parseInt(args[0]); // taking input from args
        vt.canVote(age);
    }
}
