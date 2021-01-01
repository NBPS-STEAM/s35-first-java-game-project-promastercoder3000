import java.util.ArrayList; // we import this class
// to create an arraylist that unlike an array, CAN BE resized,
// and so we can add items to the player's inventory.


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
  // add the random material to the arraylist
  // increase the wealth of the player depending on material found
  // add to weight of pounds depending on material found
  public void findRandMaterial(){ 

  }

  public void takeDamageOrFindMaterial(){ // here we'll either take damage to the player or find a material for the player's inventory and increase the wealth
  ;    
  }
  
  public boolean checkRequirementsToWin(){  //here, we'll check for a net worth of 15 dollars, 200 pounds in weight of materials. 
    return true;
}

}

//Thread.sleep(4000);
