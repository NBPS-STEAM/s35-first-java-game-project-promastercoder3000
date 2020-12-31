import java.util.ArrayList;

public class Miner{
  double wealth;
  int health;
  int weightInPounds;
  ArrayList<String> playerInventory = new ArrayList<String>();
  
  public Miner(int playerHealth, double playerWealth, int materialWeight){
    health = playerHealth;
    wealth = playerWealth;
    weightInPounds = materialWeight;
  }

  public void takeDamage(){
    health = health - 10;
    System.out.println("You have taken 10 damage. You are now at " + health + " health!");
  }

 
  
  public boolean checkRequirementsToWin(){
    return true;
}

}

//Thread.sleep(4000);
