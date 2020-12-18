import java.util.*;

public class App {
  

    String[] materials = {"Bronze", "Silver", "Gold", "Diamond"}; // will be using later, shows random materials miners can acquire while mining
    int score; // used to add to the player's score, if they reach a certain score

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      while(true){ // Everything is in THIS while loop
        // start of first while loop
      while(True){ // this while loop will pretty much start the game, ask the player to say yes or no, kinda unimportant but adds to sophistication      
        System.out.println("(The game has begun, and miner Dawson meets you at the mining station.");
        System.out.println("Greetings, fellow miner.");
        System.out.println("Would you like to hop in my brand new 'Dirt-Stone Digging Ship' with me and go on a little..");
        System.out.println("Mining trip!?!?!");
        while(True){ // nested while loop, will keep on repeating until the player says "Yes". they don't have any other option because its pretty obvious. comedical (kinda)
          System.out.println("(For the essentiality of the game, type 'Yes' with a capitalized Y, or 'No' with a capitalized N, depending on your interests :D ) ");
          String answer = input.nextLine();
          if (answer.equals("Yes")){
            System.out.println("Alright, lets go!");
            break;
          }
          else if (answer.equals("No")){
            System.out.println("That's cool and all, but we're gonna ask again.");
          }
          else {
            System.out.println("You must have made a spelling mistake or forgot to capitalize something. Make sure you typed 'Y-e-s' or 'N-o' with capitalized first letters.");
          }
          break;
        }
    }
    // end of first while loop
    // __________________________
    // start of second while loop
    while(True){

    }

      }
}
}
