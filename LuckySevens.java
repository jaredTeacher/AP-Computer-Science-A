/**
 *  A class that models the game of Lucky Sevens. 
 *  
 *  @author: Your Name
 *  @AP Computer Science A, Virtual Virginia
 */
import java.util.Random; 

public class LuckySevens
{
    private int balance;
    private int numOfTurns;
    
    //return​a randomly generated integer from a standard​die
    static int rollDie() {
        
        Random rand = new Random();
        
        int rand_die = rand.nextInt(6) + 1;
        
        return rand_die;
    }
    
    static int playTurn() {
        int dieOne, dieTwo, totalDie;
        
        dieOne = rollDie();
        dieTwo = rollDie();
        totalDie = dieOne + dieTwo;
        
        return totalDie;
    }
  
  
  
    static void playGame() {
        // code to be executed
    }
    static void getGameReport() {
        // code to be executed
    }
    public int getNumOfTurns() {
        return playTurn();
    }
    static void getBalance() {
        // code to be executed
    }

}


