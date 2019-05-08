package create.factory.simple;

public class Add implements Operation {

    @Override
    public double calc(double a, double b) {
        return a + b;
    }
}
