package animals;

public interface Animal {
    String move();
    String breath();
    String reproduce();
    double eat(double amount);
    int getId();
}