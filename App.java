import java.util.*;

public class App {
  

     // will be using later, shows random materials miners can acquire while mining

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      while(true){ // Everything is in THIS while loop
        // start of first nested while loop
        while(True){ // this while loop will pretty much start the game, ask the player to say yes or no, kinda unimportant but adds to sophistication      
          System.out.println("Welcome to the game! You'll be embarking on a mining mission.");
          System.out.println("To win, you need to not only acquire a net worth of fifteen dollars, but you also need 200 pounds ( in weight ) worth of items to win.");
          System.out.println("Sounds hard? Well, that's life. Let's get started!");
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
          }
      }
    // end of first while loop
    // __________________________
    // start of second nested while loop
      while(True){

      }

      }
}
}
