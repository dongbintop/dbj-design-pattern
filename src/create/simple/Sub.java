package create.simple;

public class Sub implements Operation {
    @Override
    public double calc(double a, double b) {
        return a - b;
    }
}
