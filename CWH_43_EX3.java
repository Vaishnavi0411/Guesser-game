
import java.util.Random;
import java.util.Scanner;

class Game{
    int computer;
    public Game(){
        Random rand = new Random();
        computer = rand.nextInt(100);
        System.out.println("Guess the Number Form  1 to 100");
    }
    public int guesserNo(){
        return computer;
    }
}
public class CWH_43_EX3 {
    static int takeUserInput(){
        int user;
        System.out.println("Enter ");
        Scanner sc= new Scanner(System.in);
        user=sc.nextInt();
        return user;
    }

    static void isCorrectNumber(int i, int j){
        if(i==j){
            System.out.println("Correct NO. Guess");
        }
        else if(i>j){
            System.out.println("Your No. is Big than  guesser No.");
        }
        else {
            System.out.println("Your No. is Small than guesser No.");
        }
    }
    public static void main(String[] args) {
        int user=0,guesser=0,itteration=0;
        Game g = new Game();
        do {
            user = takeUserInput();
            guesser = g.guesserNo();
//            System.out.println(user);
//            System.out.println(computer);
            isCorrectNumber(user, guesser);
            itteration++;
        }while (user!=guesser);
        System.out.println("YOU GUESS NO IN "+ itteration+" ITTERATIONS");

//        Create a class Game, which allows a user to play "Guess the Number" game once.
//
//        Game should have the following methods:
//        Constructor to generate the random number
//        takeUserInput() to take a user input of number
//        isCorrectNumber() to detect whether the number entered by the user is true
//        getter and setter for noOfGuesses
//        Use properties such as noOfGuesses(int), etc to get this task done!
    }
}