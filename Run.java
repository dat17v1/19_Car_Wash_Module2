public class Run {

  public static void main(String[] x) {
    // 7 - Call constructor to create an object
    // Type navn = new Type(*evt parametre)
    GarbageMan gman1 = new GarbageMan("Per", 120.75 );

    // 8 - Creating
    // Create object - call methods with parameters.
    // object name = customer1
    Customer customer1 = new Customer();
    // Method call - objectName.methodName(*evt param.);
    customer1.setName("Helle");
    customer1.setWealth(100.25);

    // 10
    customer1.orderGarbageMan(gman1.getPrice());

    // 11
    System.out.println("Customers wealth: " 
      + customer1.getWealth());
  }

}