package animals;

public class Mammal extends AnimalImpl {

    public Mammal(String name, int yearDiscovered) {
        super(name, yearDiscovered);
    }

    @Override
    public String move() {
        return "Walk";
    }

    @Override
    public String breath() {
        return "Lungs";
    }

    @Override
    public String reproduce() {
        return "Live Birth";
    }

    @Override
    public double eat(double amount) {
        return 0.0;
    }
}