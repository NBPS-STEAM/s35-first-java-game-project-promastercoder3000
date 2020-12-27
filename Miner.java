public class Miner{
  double wealth;
  int health;
  int weightInPounds;
  String[] materials = {"Bronze", "Bronze", "Bronze", "Bronze", "Silver", "Silver", "Silver", "Gold", "Gold", "Diamond"};
  String[] inventory = {};
  
  public Player(int playerHealth, double playerWealth, int materialWeight){
    health = playerHealth;
    wealth = playerWealth;
    weightInPounds = materialWeight;
  }

  public void takeDamage(){
    health = health - 10;
    System.out.println("You have taken 10 damage. You are now at " + health + " health!");
  }

 
  public void addMaterialAndIncreaseWealth(){
      int randomNum = (int)(Math.random() * 10);
      randMaterial = materials[randomNum];
      inventory.add(randMaterial);
      if (randMaterial.equals(materials[0]) || randMaterial.equals(materials[1]) || randMaterial.equals(materials[2]) || randMaterial.equals(materials[3])){
        wealth += 1.25;
      }
      else if (randMaterial.equals(materials[4]) || randMaterial.equals(materials[5]) || randMaterial.equals(materials[6])){
        wealth += 1.50;
      }
      else if (randMaterial.equals(materials[7]) || randMaterial.equals(materials[8])){
        wealth += 1.75;
      }
      else {
        wealth += 2.00;
      }
      System.out.println("You have acquired: " + randMaterial);
      System.out.println("Your current net worth is: " + wealth);
  }

  public boolean checkRequirementsToWin(){
      for(int i = 0; i < inventory.length; i++){
          if (inventory[i].equals("Bronze")){
            weightInPounds += 5;
          }
          else if (inventory[i].equals("Silver")){
            weightInPounds += 10;
          }
          else if (inventory[i].equals("Silver")){
            weightInPounds += 15;
          }
          else {
            weightInPounds += 25;
          }
  }
    if (weightInPounds >= 200 && wealth >= 15 ){
        System.out.println("You've met the requirements to win! Nice!");
        return true;
    }
    else {
      return false;
    }
}
}

//Thread.sleep(4000);
