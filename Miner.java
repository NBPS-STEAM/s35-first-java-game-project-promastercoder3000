import java.util.ArrayList; // we import this class
// to create an arraylist that unlike an array, CAN BE resized,
// and so we can add items to the player's inventory.
import java.util.Random; // class that is imported to generate random values through insantiated random objects 


public class Miner{
  double wealth; // variable to represnt player's wealth
  int health; //player's health when fighting the moles ( underground animals)
  int weightInPounds; //weight of materials
  String[] materials = {"Bronze", "Silver", "Gold", "Diamond", "Bronze", "Silver", "Gold", "Bronze", "Silver", "Bronze"}; //materials available in the game, each material has its own worth as well as weight in pounds..

  // each string in the array is considered a "block" of that material type, rather than a "gram," kinda like minecraft, where you find blocks of these materials instead of individual materials.
  
  // the weight and price of each is not according
  // to reality, rather, to the game, so you may find a discrepancy between the value and weight of these items compared to their real-life counterparts.

  // bronze = $1, silver = $2, gold = $4, and diamond = $8. essentially the value is doubled by each material.
  // bronze = 12 pounds, silver = 24 pounds, gold = 48 pounds, diamond = 96 pounds

  ArrayList<String> playerInventory = new ArrayList<String>();
  
  
  public Miner(int playerHealth, double playerWealth, int materialWeight){    
    //here, we create the constructor for the class, setting our appropiate variables.
    health = playerHealth;
    wealth = playerWealth;
    weightInPounds = materialWeight;
  }

  
  public void takeDamage(){ 
      // this method is for taking damage to the player's machine, which is a side struggle of the game that the player must worry about.
    System.out.println("Machine: Mole spotted! Ahh!");
    health = health - 10;
    System.out.println("Machine: The mole has clawed at me and drained 10% of my battery. I'm now at " + health + " health left!\n Please be careful, or we'll both be stuck and buried within the dirt of the Earth, unable to move!"); //print out player's health after they're damaged.
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
      if(materials[randItem].equals("Bronze")){
        System.out.println("Machine: Bronze block located. $1 increase in net worth as well as a 12 pound increase in weight. Great.");
        wealth += 1;
        weightInPounds +=12;
      }
      else if(materials[randItem].equals("Silver")){
        System.out.println("Machine: Silver block located! $2 increase in networth along with 24 pounds of silver added to your inventory.");
        wealth += 2;
        weightInPounds += 24;
      }
      else if(materials[randItem].equals("Gold")){
        System.out.println("Machine: Gold block located! How rare! $4 increase in net worth and 48 pounds ");
        wealth += 4;
        weightInPounds += 48;
      }
      else if(materials[randItem].equals("Diamond")){
        System.out.println("Machine: You've spotted a whole diamond! Geez, I'm a machine and even I can feel the joy of finding this. You have increased eight dollars in net worth, and that'll be an added 96 pounds to your container. Lucky us.");
        wealth += 8;
        weightInPounds += 96;

      }
      
  }

  public void printStats(){
    // here we will print out the object's arraylist, which represents the inventory of the player,
    // as well as the variables wealth and weightInPounds, which represent the player's current statistics ( how much money they have and how much their inventory weighs)
    System.out.println("Machine: Now, here is everything in our container. " + playerInventory);
    System.out.println("Machine: Our net worth is now: " + wealth + " dollars");
    System.out.println("Machine: The weight in pounds of our container is " + weightInPounds + " pounds");
  }

  public void takeDamageOrFindMaterial(){ // here we'll either take damage to the player or find a material for the player's inventory and increase the wealth
  ;    
  }
  
  public boolean checkRequirementsToWin(){  //here, we'll check for a net worth of 15 dollars, 200 pounds in weight of materials. 
    return true;
}

}

//Thread.sleep(4000);

//To win,
 //you need:
//a net worth of fifteen dollars, 
// 200 pounds ( in weight ) worth of items to win.