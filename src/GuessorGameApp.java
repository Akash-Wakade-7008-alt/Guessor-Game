import java.lang.*;
import java.util.*;

/**
 * Entry point of the Guessor Game application.
 *
 * <p>This program simulates a simple number guessing game.
 * A Guessor chooses a number, and five players attempt to predict it.
 * The Umpire collects the number from the Guessor and the predictions
 * from all players, compares them, and declares the winner if any
 * player correctly guesses the number.</p>
 *
 * <p>If none of the players guess the correct number, the game
 * ends with no winner.</p>
 *
 * @author Akash Wakade
 * @version 1.0
 */
class GuessorGameApp
{
    public static void main(String[] args) {

     


        Umpire u = new Umpire();

        u.collectingNumFromGuessor();
        u.collectingNumFromPlayers();
        u.comparing();
    }
}


/**
 * Represents the Guessor in the game.
 *
 * <p>The Guessor selects a number that the players must try to predict.
 * The selected number is then provided to the Umpire for comparison
 * with the players' predictions.</p>
 */
class Guessor
{
    int gnum;

    /**
     * Prompts the guessor to enter a number.
     *
     * @return the number guessed by the guessor
     */
    int guessingNum()
    {
        System.out.println("Guessor! Kindly guess any number");
        Scanner scan = new Scanner(System.in);
        gnum = scan.nextInt();
        return gnum;
    }
}


/**
 * Represents a player participating in the guessing game.
 *
 * <p>Each player attempts to predict the number chosen by the Guessor.
 * The predicted number is sent to the Umpire, who compares it with
 * the Guessor's number to determine if the player has won.</p>
 */
class Player
{
    int pnum;

    /**
     * Collects prediction from Player 1.
     *
     * @return the predicted number
     */
    int predictNumByPlayer1()
    {
        System.out.println("Player 1! Kindly predict the number from 1 to 100");
        Scanner scan = new Scanner(System.in);
        pnum = scan.nextInt();
        return pnum;
    }

    /**
     * Collects prediction from Player 2.
     *
     * @return the predicted number
     */
    int predictNumByPlayer2()
    {
        System.out.println("Player 2! Kindly predict the number from 1 to 100");
        Scanner scan = new Scanner(System.in);
        pnum = scan.nextInt();
        return pnum;
    }

    /**
     * Collects prediction from Player 3.
     *
     * @return the predicted number
     */
    int predictNumByPlayer3()
    {
        System.out.println("Player 3! Kindly predict the number from 1 to 100");
        Scanner scan = new Scanner(System.in);
        pnum = scan.nextInt();
        return pnum;
    }

    /**
     * Collects prediction from Player 4.
     *
     * @return the predicted number
     */
    int predictNumByPlayer4()
    {
        System.out.println("Player 4! Kindly predict the number from 1 to 100");
        Scanner scan = new Scanner(System.in);
        pnum = scan.nextInt();
        return pnum;
    }

    /**
     * Collects prediction from Player 5.
     *
     * @return the predicted number
     */
    int predictNumByPlayer5()
    {
        System.out.println("Player 5! Kindly predict the number from 1 to 100");
        Scanner scan = new Scanner(System.in);
        pnum = scan.nextInt();
        return pnum;
    }
}


/**
 * Represents the Umpire who manages the game process.
 *
 * <p>The Umpire is responsible for coordinating the game by:
 * <ul>
 *   <li>Collecting the number guessed by the Guessor</li>
 *   <li>Collecting predictions from all players</li>
 *   <li>Comparing the guessed number with player predictions</li>
 *   <li>Declaring the winner if a match is found</li>
 * </ul>
 *</p>

 * <p>If no player's prediction matches the Guessor's number,
 * the Umpire declares that all players have lost the game.</p>
 */
class Umpire
{
    int numFromGuessor;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    int numFromPlayer4;
    int numFromPlayer5;

    /**
     * Collects the number guessed by the Guessor.
     */
    void collectingNumFromGuessor()
    {
        Guessor g = new Guessor();
        numFromGuessor = g.guessingNum();
    }

    /**
     * Collects predicted numbers from all players.
     */
    void collectingNumFromPlayers()
    {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        Player p4 = new Player();
        Player p5 = new Player();

        numFromPlayer1 = p1.predictNumByPlayer1();
        numFromPlayer2 = p2.predictNumByPlayer2();
        numFromPlayer3 = p3.predictNumByPlayer3();
        numFromPlayer4 = p4.predictNumByPlayer4();
        numFromPlayer5 = p5.predictNumByPlayer5();
    }

    /**
     *</p> Compares the number guessed by the Guessor with the
     * predictions made by each player and declares the result.
     *</p>
     */
    void comparing()
    {
        if(numFromGuessor == numFromPlayer1)
        {
            System.out.println("Congratulations Player 1! You have won the game.");
        }
        else if(numFromGuessor == numFromPlayer2)
        {
            System.out.println("Congratulations Player 2! You have won the game.");
        }
        else if(numFromGuessor == numFromPlayer3)
        {
            System.out.println("Congratulations Player 3! You have won the game.");
        }
        else if(numFromGuessor == numFromPlayer4)
        {
            System.out.println("Congratulations Player 4! You have won the game.");
        }
        else if(numFromGuessor == numFromPlayer5)
        {
            System.out.println("Congratulations Player 5! You have won the game.");
        }
        else
        {
            System.out.println("No one successfully guessed the number!");
        }
    }
}