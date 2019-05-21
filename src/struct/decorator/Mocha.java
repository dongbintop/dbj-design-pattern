package struct.decorator;

public class Mocha implements Beverage {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String description() {
        return beverage.description() + ",Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 10.2;
    }
}
