package animals;

public class Fish extends AnimalImpl {

  public Fish(String name, int yearDiscovered) {
    super(name, yearDiscovered);
  }

  @Override
  public String move() {
    return "Swim";
  }

  @Override
  public String breath() {
    return "Gills";
  }

  @Override
  public String reproduce() {
    return "Eggs";
  }

  @Override
  public double eat(double amount) {
    return 0;
  }

}