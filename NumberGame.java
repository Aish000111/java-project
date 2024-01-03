import java.util.Random;
import java.util.Scanner;
public class NumberGame{
    public static void main(String[] args)
    {
    //create random number.
    Scanner scanner = new Scanner(System.in);
    //score
    int score = 0;

    //multiple round
    boolean playAgain = true;
    while (playAgain) {
       if (playGame(scanner)){
        score++;
       }
        System.out.println("Do you want to play again?(yes/no)");
        String playAgainInput = scanner.next().toLowerCase();
        playAgain = playAgainInput.equals("yes");

        
    }
    //thaking and display score
    System.out.println("Thanks for playing!your finala score is:"+score);
}
    public static boolean playGame(Scanner scanner){
        Random randomNum = new Random();
    int show = randomNum.nextInt(100);
    System .out.println("Random number between 1to 100:"+show);
    
    //attemts
    int maxAttempts=6;
    int attempts =0;

    boolean guessedCorrectly=false;
    //loop
    while (!guessedCorrectly && attempts < maxAttempts) {
        System.out.println("Attempt"+(attempts + 1) + "of" + maxAttempts);
        System.out.println("guess the number between 1 to 100:");
        int guess = scanner.nextInt();
        
    
    //Compare the user guess
    if(guess == show){
        System.out.println("Congratulation! your guess is correct.");
        guessedCorrectly = true;
    }
    else if (guess < show)
    {
        System.out.println("guess is lower number.");

    }else
    {
        System.out.println("guess is greater number.");
    }
    attempts++;
}
if(!guessedCorrectly){
    System.out.println("sorry,you reached the all attempts.The correct number was:"+show);
}  
return guessedCorrectly;


}

}