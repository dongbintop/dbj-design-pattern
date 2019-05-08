package create.factory.simple;

/**
 * 乘法
 */
public class Mul implements Operation {
    @Override
    public double calc(double a, double b) {
        return a * b;
    }
}
