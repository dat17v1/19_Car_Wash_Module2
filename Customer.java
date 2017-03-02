public class Customer {
  // 5
  private String name;
  private double wealth;

  // Just a demonstration of a rule
  public void setName2(String newName) {
    if (newName.equals("Chili")) {
      System.out.println("Not allowed");
    }
    else {
      this.name = newName;
    }
  }

  // 6 -- Settere
  public void setName(String newName) {
    name = newName;
  }
  public void setWealth(double wealth) {
    this.wealth = wealth;
  }

  // 6 -- Gettere
  public String getName() {
    return name;
  }
  public double getWealth() {
    return wealth;
  }

  // 9
  public void orderGarbageMan(double amount) {
    double result = this.wealth - amount;

    if (result >= 0 ) {
      wealth -= amount;
      //wealth = wealth - price;
    }
    else {
      System.out.println("Get a job!");
    }
  } 
  
}