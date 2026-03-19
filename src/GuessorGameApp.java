import java.util.*;

/**
 * Entry point of the Guessor Game application.
 *
 * <p>This class initializes all core components of the game:
 * {@link Guessor}, {@link Player}, and {@link Umpire}, and controls
 * the overall execution flow.</p>
 *
 * <p>The sequence of execution is as follows:</p>
 * <ol>
 *   <li>The Guessor selects a number.</li>
 *   <li>The number of players is collected.</li>
 *   <li>Each player submits their predicted number.</li>
 *   <li>The Umpire gathers all inputs and determines the winner(s).</li>
 * </ol>
 */
class Main
{
   public static void main(String[] args)
   {
       Umpire umpire = new Umpire();
       Player player = new Player();
       Guessor guessor = new Guessor();

       guessor.guessTheNum();
       player.collectNoOfPlayers();
       player.collectPredictedNumFromPlayer();

       umpire.setPlayer(player);
       umpire.setGuessor(guessor);

       umpire.collectNumFromGuessor();
       umpire.collectNumFromPlayer();
       umpire.comparing();
   }
}

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
class Player
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

/**
 * Represents the Guessor in the game.
 *
 * <p>The Guessor is responsible for choosing a number that players
 * attempt to predict.</p>
 */
class Guessor
{
    /**
     * The number guessed by the Guessor.
     */
    int gnum;

    /**
     * Prompts the Guessor to input a number.
     *
     * <p>This value is later used by the {@link Umpire} to compare
     * against player predictions.</p>
     */
    void guessTheNum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guessor! Kindly guess the number:");
        gnum = sc.nextInt();
    }
}

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
class Umpire
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