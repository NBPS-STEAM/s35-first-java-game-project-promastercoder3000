public class Miner{
  double wealth;
  int health;
  String materials = {"Bronze", "Gold", "Silver", "Diamond"};
  String inventory = {};
  
  public Player(int playerHealth, double playerWealth){
    health = playerHealth;
    wealth = playerWealth;
  }

  public void takeDamage(){
    health = health - 10;
    System.out.println("You have taken 10 damage. You are now at " + health + " health!");
  }

 
  public void addMaterialAndIncreaseWealth(){
      int randomNum = (int)(Math.random() * 4);
      randMaterial = materials.get(randomNum);
      inventory.add(randMaterial);
      if (randMaterial.equals(materials.get(0))){
        wealth += 1.25;
      }
      else if (randMaterial.equals(materials.get(1))){
        wealth += 1.50;
      }
      else if (randMaterial.equals(materials.get(2))){
        wealth += 1.75;
      }
      else {
        wealth += 2.00;
      }
      System.out.println("You have acquired: " + randMaterial);
      System.out.println("Your current net worth is: " + wealth);
  }

  public void checkRequirementsToWin(){
    
  }

}
