public class GarbageMan {
  // 2
  private double price; // eg.unit 120.75 kr
  private String name;

  // 3
  public GarbageMan(String name, double price) {
    this.name = name;
    this.price = price;
    System.out.println(this.getName());
  }

  // 4
  public String getName() {
    return this.name;
  }
  public double getPrice() {
    return this.price;
  }
  

}