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
  // NOTICE: Each material has a different worth as well as different weight in pounds associated with the material. This is why there are different
  // increases in the integer variables "wealth" and 'weightInPounds' depending on what each material is. 
  // This is why we have incorporated if statements that check what material has been randomly generated and compares it to a certain string, as shown below.
  // An if statement turns out to be true when the element indicated by the randomly generated index of the array is equal to the string it is being compared to.
  // The program will go through each if statement until the material-specific if statement that returns true is found and executed.
  // For purposes of abstraction, all these if statements are contained within the below method. Many lines of code have been simplified into a single method
  // that we will call in the main class, App.
  public void findRandMaterial(){ 
      Random rand = new Random(); // here we instantiate a random object that will be used in our code.
      int randItem = rand.nextInt(materials.length); // here, we create an integer variable called randItem that generates a random number from 0
      // to the length of the array. We will use this to capture a random index from the materials array.
      playerInventory.add(materials[randItem]);
      if(materials[randItem].equals("Bronze")){ // an if statement that checks if the element indicated by the randomly generated index of the array is equal to the string "Bronze" 
        System.out.println("Machine: Bronze block located. $1 increase in net worth as well as a 12 pound increase in weight. Great."); // A message that is outputted each time this if statement is true (if the element is equal to "Bronze")
        wealth += 1; // increase the value of the integer variable wealth by 1 if the if statement is true
        weightInPounds += 12; // increase the value of the integer variable weightInPounds by 12 if the if statement is true
      }
      else if (materials[randItem].equals("Silver")){  // an if statement that checks if the element indicated by the randomly generated index of the array is equal to the string "Silver"
        System.out.println("Machine: Silver block located! $2 increase in networth along with 24 pounds of silver added to your inventory."); // A message outputted if the if statement is true
        wealth += 2; // increase the value of the integer variable wealth by 2 if the if statement is true
        weightInPounds += 24; // increase the value of the integer variable weightInPounds by 24 if the if statement is true
      }
      else if(materials[randItem].equals("Gold")){ // an if statement that checks if the element indicated by the randomly generated index of the array is equal to the string "Gold"
        System.out.println("Machine: Gold block located! How rare! $4 increase in net worth and 48 pounds "); // A message outputted if the if statement is true
        wealth += 4; // increase the value of the integer variable wealth by 4 if the if statement is true
        weightInPounds += 48; // increase the value of the integer variable weightInPounds by 48 if the if statement is true
      }
      else if(materials[randItem].equals("Diamond")){ // an if statement that checks if the element indicated by the randomly generated index of the array is equal to the string "Gold"
        System.out.println("Machine: You've spotted a whole diamond! Geez, I'm a machine and even I can feel the joy of finding this. You have increased eight dollars in net worth, and that'll be an added 96 pounds to your container. Lucky us."); // A message outputted if the if statement is true 
        wealth += 8; // increase the value of the integer variable wealth by 8 if the if statement is true
        weightInPounds += 96; // increase the value of the integer variable weightInPounds by 96 if the if statement is true.
      }
      
  }

  public void printStats(){
    // here we will print out the object's arraylist, which represents the inventory of the player,
    // as well as the variables wealth and weightInPounds, which represent the player's current statistics ( how much money they have and how much their inventory weighs)
    System.out.println("Machine: Now, here is everything in our container. " + playerInventory);
    System.out.println("Machine: Our net worth is now: " + wealth + " dollars");
    System.out.println("Machine: The weight in pounds of our container is " + weightInPounds + " pounds");
    System.out.println("Machine: We are at " + health + " health left.");
  }

  public void takeDamageOrFindMaterial() { // here we'll either take damage to the player or find a material for the player's inventory and increase the wealth all based on a randomly generated number.
   Random rand = new Random(); // instantiate an object called "rand" from the random class 
   int randNumber = rand.nextInt(1); // create an integer variable called randNumber that generates a random number from, by default, 0, to the specified number within the parenthesis, which in this case, is 1.\
   if (randNumber == 0){
     findRandMaterial();
   }
   else if (randNumber == 1){
     takeDamage();
   }
  }
  
  public boolean checkRequirementsToWin(){  //here, we'll check for a net worth of 15 dollars, 200 pounds in weight of materials. 
    if(wealth >= 15 && weightInPounds >= 200){
      System.out.println("Machine: We have acquired the expected net worth from our materials, which is $15, and the expected total weight in pounds of our inventory, which is 200 pounds.");
      return true;
    }
    else
    {
      return false;
    }
}

public boolean checkPlayerHealth(){
  if (health <= 0){
    System.out.println("Machine: Poweri..ng.. d..ow...n...");
    return true;
  }
  else {
    return false;
  }
}

}

//Thread.sleep(4000);

//To win,
 //you need:
//a net worth of fifteen dollars, 
// 200 pounds ( in weight ) worth of items to win.