// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Random;
import java.util.Scanner;


public class Rock
{
   public static void main(String[] args)
   {
      String personPlay;    //User's play -- "R", "P", or "S"
        String computerPlay="";  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number used to determine
                              //computer's play


        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        
        
        //Get player's play -- note that this is stored as a string
        System.out.println("enter your play(R, P, S):");
        //Make player's play uppercase for ease of comparison
        personPlay=scan.nextLine().toUpperCase();
        //Generate computer's play (0,1,2)
        computerInt=generator.nextInt(3);
        //Translate computer's randomly generated play to string
        switch (computerInt)
        {
            case 0-> computerPlay="R";
            case 1-> computerPlay="P";
            case 2-> computerPlay="S";

        }
        
        //Print computer's play
        System.out.println("Computer move is:"+computerPlay);
        //See who won.  Use nested ifs instead of &&.
        if (personPlay.equals(computerPlay)){ 
            System.out.println("It's a tie!");
        }
        else if (personPlay.equals("R")){
            if (computerPlay.equals("S")){
                System.out.println("Rock crushes scissors.  You win!!");
            }
             else{
                System.out.println("Paper covers rock. You lose.");
             }
        }
        else if (personPlay.equals("P")) {
            if (computerPlay.equals("R")) {
                System.out.println("Paper covers rock. You win!!");
            } else {
                System.out.println("Scissors cut paper. You lose.");
            }
        } else if (personPlay.equals("S")) {
            if (computerPlay.equals("P")) {
                System.out.println("Scissors cut paper. You win!!");
            } else {
                System.out.println("Rock crushes scissors. You lose.");
            }
        } else {
            System.out.println("Invalid input! Please enter R, P, or S.");
        }

        scan.close();
   }
}