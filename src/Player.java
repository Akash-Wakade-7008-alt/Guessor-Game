import java.util.*;
/**
 * Represents the participants of the game.
 *
 * <p>This class is responsible for managing player-related data,
 * including the number of players and their predicted numbers.</p>
 *
 * <p>It performs two primary tasks:</p>
 * <ul>
 *   <li>Collecting the total number of players participating.</li>
 *   <li>Collecting each player's predicted number.</li>
 * </ul>
 */
public class Player
{
    /**
     * Total number of players participating in the game.
     */
    int noOfPlayers;

    /**
     * Array storing the predicted numbers entered by each player.
     * The index represents the player (index + 1).
     */
    int[] pnum;

    Scanner sc = new Scanner(System.in);

    /**
     * Prompts the user to enter the number of players.
     *
     * <p>This method initializes the {@code pnum} array based on
     * the number of players provided.</p>
     */
    void collectNoOfPlayers()
    {
        System.out.println("Enter number of players:");
        noOfPlayers = sc.nextInt();
        pnum = new int[noOfPlayers];
    }

    /**
     * Collects predicted numbers from each player.
     *
     * <p>The method iterates through all players and stores their
     * inputs in the {@code pnum} array.</p>
     *
     * <p>Each index of the array corresponds to a specific player.</p>
     */
    void collectPredictedNumFromPlayer()
    {
        for(int i = 0; i < noOfPlayers; i++)
        {
            System.out.printf("Player %d! Enter the number: ", i + 1);
            pnum[i] = sc.nextInt();
        }
    }
}