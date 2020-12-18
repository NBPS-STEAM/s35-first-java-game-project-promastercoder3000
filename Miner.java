public class Miner{
  double wealth;
  int health;
  double randomNum;
  
  public Player(int playerHealth, double playerWealth){
    health = playerHealth;
    wealth = playerWealth;
  }

  public void takeDamage(){
    health = health - 10;
    System.out.println("You have taken 10 damage. You are now at " + health + " health!");
  }

  public double increaseWealth(randomNum){
      wealth = wealth + randomNum;
      System.out.println("You now have " + wealth + " dollars! Nice!!!!!");
  }
}