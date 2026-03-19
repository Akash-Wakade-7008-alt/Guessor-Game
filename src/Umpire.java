import java.util.*;
/**
 * Acts as the coordinator of the game.
 *
 * <p>The Umpire is responsible for collecting inputs from both the
 * {@link Guessor} and {@link Player}, and determining the outcome
 * of the game.</p>
 *
 * <p>Responsibilities include:</p>
 * <ul>
 *   <li>Retrieving the guessed number from the Guessor.</li>
 *   <li>Retrieving predicted numbers from all players.</li>
 *   <li>Comparing values and declaring winner(s).</li>
 * </ul>
 *
 * <p>If one or more players correctly predict the number, they are
 * declared winners. Otherwise, the game ends with no winners.</p>
 */
public class Umpire
{
    /**
     * Reference to the Player object containing player data.
     */
    Player player;

    /**
     * Reference to the Guessor object containing the guessed number.
     */
    Guessor guessor;

    /**
     * Stores the number collected from the Guessor.
     */
    int numFromGuessor;

    /**
     * Stores the predicted numbers collected from players.
     */
    int[] numFromPlayer;

    /**
     * Assigns the Player object to the Umpire.
     *
     * @param player the Player instance containing player inputs
     */
    void setPlayer(Player player)
    {
        this.player = player;
    }

    /**
     * Assigns the Guessor object to the Umpire.
     *
     * @param guessor the Guessor instance containing the guessed number
     */
    void setGuessor(Guessor guessor)
    {
        this.guessor = guessor;
    }

    /**
     * Retrieves the guessed number from the Guessor.
     */
    void collectNumFromGuessor()
    {
        numFromGuessor = guessor.gnum;
    }

    /**
     * Copies predicted numbers from the Player object into a local array.
     *
     * <p>This method ensures that all player inputs are available
     * for comparison.</p>
     */
    void collectNumFromPlayer()
    {
        numFromPlayer = new int[player.noOfPlayers];

        for(int i = 0; i < player.noOfPlayers; i++)
        {
            numFromPlayer[i] = player.pnum[i];
        }
    }

    /**
     * Compares the Guessor's number with each player's prediction.
     *
     * <p>If a match is found, the corresponding player(s) are declared
     * as winners. If no matches are found, the game concludes with
     * no winners.</p>
     */
    void comparing()
    {
        int flag = 0;

        for(int i = 0; i < player.noOfPlayers; i++)
        {
            if(numFromGuessor == numFromPlayer[i])
            {
                System.out.printf("Congratulations player %d, you have won the game\n", i + 1);
                flag = 1;
            }
        }

        if(flag == 0)
        {
            System.out.println("Game over!! No one has won");
        }
    }
}