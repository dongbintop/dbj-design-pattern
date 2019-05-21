package struct.decorator;

public class DarkRoast implements Beverage {
    @Override
    public String description() {
        return "DarkRoast";
    }

    @Override
    public double cost() {
        return 2.50;
    }
}
