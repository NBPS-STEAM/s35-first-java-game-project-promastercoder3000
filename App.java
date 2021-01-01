import java.util.*; // we will be using scanner objects, so this is important to import.

public class App {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      while(true){ // Everything is in THIS while loop
        // start of first nested while loop
        while(true){ // this while loop will pretty much start the game, ask the player to say yes or no, adds to sophistication      
          Miner MinerObj = new Miner(100, 0.0, 0);
          MinerObj.findRandMaterial();
          MinerObj.printStats();   // create our "Miner" object, which is the player.
          System.out.println("(Welcome to the game! You'll be embarking on a mining mission.)");
          System.out.println("(To win, you need to not only acquire a net worth of fifteen dollars, but you also need 200 pounds ( in weight ) worth of items to win.)");
          System.out.println("(Sounds hard? Well, that's life. Let's get started!)");
          System.out.println("(The game has begun, and miner Dawson meets you at the mining station.");
          System.out.println("Miner Dawson: Greetings, fellow miner.");
          System.out.println("Miner Dawson: We've built a brand-new 'Dirt-Stone Digging Machine' for you. It can speak and burrow through the Earth quicky and efficiently. Would you like to hop in and go on a.. ");
          System.out.println("Miner Dawson: Mining trip!?!?!");
          while(true){ // nested while loop, will keep on repeating until the player says "Yes". they don't have any other option because its pretty obvious. comedical (kinda)
            System.out.println("(For the essentiality of the game, type 'Yes' with a capitalized Y, or 'No' with a capitalized N.) ");
            String answer = input.nextLine();
            if (answer.equals("Yes")){
              System.out.println("Alright, lets go!");
              break;
            }
            else if (answer.equals("No")){
              System.out.println("That's cool and all, but I'm gonna ask again.");
            }
            else {
              System.out.println("You must have made a spelling mistake or forgot to capitalize something. Make sure you typed 'Y-e-s' or 'N-o' with capitalized first letters.");
            }
          }
          System.out.println("Step into the ship, and go from there.");
          System.out.println("(The ship's doors open, and you take a step into the tight, although oddy comfortable, space, and sit in a black, leather chair in front of a glass window.");
          System.out.println("(The ship's door closes, and the machine begins speaking to you.");
          System.out.println("Machine: Hello. I have not been given a name yet, but you can call me Machine. ");
          System.out.println("Machine> I've been programmed by Mr. Dawson to take you on a little adventure. I've been ordered not to take you back up to the station until we get $15 as well as 200 pounds of materials. We will venture in three. two.. one.. ");
          System.out.println("(A hatch in the stadium's floor opens, and the ship begins digging through aggressively.)");
          System.out.println("Machine: Dawson did not mention this, but there are dangerous, sneaky moles inside the dirt. Please be careful, because I don't want to get damaged, for us machines have feelings too. I also was not programmed to say these exact words.");
          System.out.println("(Dirt and soil stain your window as you make your way through underground tunnels.)");
          break;
      }
    // end of first nested while loop
    // __________________________
    // start of second nested while loop
        while(true){
          ;
        }
      }       
}
}
