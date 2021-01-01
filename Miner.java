import java.util.ArrayList; // we import this class
// to create an arraylist that unlike an array, CAN BE resized,
// and so we can add items to the player's inventory.
import java.util.Random; // class that is imported to generate random values through insantiated random objects 


public class Miner{
  double wealth; // variable to represnt player's wealth
  int health; //player's health when fighting the moles ( underground animals)
  int weightInPounds; //weight of materials
  String[] materials = {"Bronze", "Silver", "Gold", "Diamond"}; //materials available in the game, each material has its own worth as well as weight in pounds..
  ArrayList<String> playerInventory = new ArrayList<String>();
  
  public Miner(int playerHealth, double playerWealth, int materialWeight){    //here, we create the constructor for the class, setting our appropiate variables.
    health = playerHealth;
    wealth = playerWealth;
    weightInPounds = materialWeight;
  }

  public void takeDamage(){   // this method is for taking damage to the player, which is a side struggle of the game that the player must worry about.
    health = health - 10;
    System.out.println("You have taken 10 damage. You are now at " + health + " health!"); //print out player's health after they're damaged.
  }

  //method for finding bronze/silver/gold/diamond below
  // in this method, we'll have to :
  // generate a random number and find a random index
  // add the random material to the arraylist
  // increase the wealth of the player depending on material found
  // add to weight of pounds depending on material found
  public void findRandMaterial(){ 
      Random rand = new Random(); // here we instantiate a random object that will later be used in our code.
      int randItem = rand.nextInt(materials.length); // here, we create an integer variable called randItem that generates a random number from 0
      // to the length of the array. We will use this to capture a random index from the materials array.
      playerInventory.add(materials[randItem]);
      
  }

  public void takeDamageOrFindMaterial(){ // here we'll either take damage to the player or find a material for the player's inventory and increase the wealth
  ;    
  }
  
  public boolean checkRequirementsToWin(){  //here, we'll check for a net worth of 15 dollars, 200 pounds in weight of materials. 
    return true;
}

}

//Thread.sleep(4000);
