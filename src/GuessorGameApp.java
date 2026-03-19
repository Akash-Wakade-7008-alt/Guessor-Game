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
public class GuessorGameApp
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



