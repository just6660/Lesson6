
package guessGame;

public class GuessMachine {
    private int number, numGuesses, guess;
    
    public GuessMachine(){
        numGuesses = 0;
        guess = 0;
        number = (int)(Math.random() * 100 + 1);
    }
    
    public String giveHint(){
        String str;
        if(guess<1 || guess>100)
            str = "Please enter a number between 1 and 100";
        else if(guess==number)
            str = "You got it";
        else if(guess>number)
            str = "You guessed: " + guess + ". Too high guess lower";
        else
            str = "You guessed: " + guess + ". Too low guess higher";

        return str;
            
    }
    
    public boolean setGuess(int n){
        guess = n;
        if(guess >=1 && guess<=100){
            numGuesses++;
            return true;
        }
        else
            return false;
    }
    public int getnumGuesses(){
        return numGuesses;
    }
}
