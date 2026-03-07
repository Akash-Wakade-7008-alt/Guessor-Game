
import java.lang.*;
import java.util.*;
 class GuessorGameApp
{
	public static void main(String[] args) {

    Umpire u = new Umpire();
   
   u.collectingNumFromGuessor();
   u.collectingNumFromPlayers();
   u.comparing();

	}
}


class Guessor
{
    int gnum;
    
    int guessingNum()
    {
        System.out.println("Guessor ! kindly guess any number");
                 Scanner scan = new Scanner(System.in);
                 gnum=scan.nextInt();
                 return gnum;
    }
}

class Player
{
    int pnum;
    
    int predictNumByPlayer1()
    {
        System.out.println("Player 1 ! kindly predict the number from 1 to 100");
        Scanner scan = new Scanner(System.in);
        pnum=scan.nextInt();
        return pnum;
    }
    
     int predictNumByPlayer2()
    {
        System.out.println("Player 2 ! kindly predict the number from 1 to 100");
        Scanner scan = new Scanner(System.in);
        pnum=scan.nextInt();
        return pnum;
    }
    
     int predictNumByPlayer3()
    {
        System.out.println("Player 3 ! kindly predict the number from 1 to 100");
        Scanner scan = new Scanner(System.in);
        pnum=scan.nextInt();
        return pnum;
    }
    
     int predictNumByPlayer4()
    {
        System.out.println("Player 4 ! kindly predict the number from 1 to 100");
        Scanner scan = new Scanner(System.in);
        pnum=scan.nextInt();
        return pnum;
    }
    
     int predictNumByPlayer5()
    {
        System.out.println("Player 5 ! kindly predict the number from 1 to 100");
        Scanner scan = new Scanner(System.in);
        pnum=scan.nextInt();
        return pnum;
    }
}

class Umpire
{
    int numFromGuessor;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    int numFromPlayer4;
    int numFromPlayer5;
    void collectingNumFromGuessor()
    {
        Guessor g=new Guessor();
        numFromGuessor=g.guessingNum();
    }
    
    void collectingNumFromPlayers()
    {
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();
           Player p4=new Player();
        Player p5=new Player();

        numFromPlayer1=p1.predictNumByPlayer1();
        numFromPlayer2=p2.predictNumByPlayer2();
        numFromPlayer3= p3.predictNumByPlayer3();
        numFromPlayer4=p4.predictNumByPlayer4();
        numFromPlayer5= p5.predictNumByPlayer5();
    }
    
    void comparing()
    {
        if(numFromGuessor==numFromPlayer1)
        {
            System.out.println("Congratulations player1 you have won the game");
        }
        
        else if(numFromGuessor==numFromPlayer2)
        {
            System.out.println("Congratulations player2 you have won the game");
        }
        else if(numFromGuessor==numFromPlayer3)
        {
            System.out.println("Congratulations player3 you have won the game");
        }
        else if(numFromGuessor==numFromPlayer4)
        {
         System.out.println("Congratulations player4 you have won the game");   
        }
        else if(numFromGuessor==numFromPlayer5)
        {
            System.out.println("Congratulations player5 you have won the game");
        }
        else
        {
        System.out.println("No one sucessfully guessed the number !");    
        }
    }
}





