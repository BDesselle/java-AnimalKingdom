package animals;

public class Bird extends AnimalImpl {

    public Bird(String name, int yearDiscovered) {
        super(name, yearDiscovered);
    }

    @Override
    public String move() {
        return "Fly";
    }

    @Override
    public String breath() {
        return "Lungs";
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