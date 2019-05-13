package create.simple;

public class SimpleFactory {

    public static Operation createOpteration(String type) {
        Operation op;
        switch (type) {
            case "-":
                op = new Sub();
                break;
            case "*":
                op = new Mul();
                break;
            case "/":
                op = new Div();
                break;
            default:
                op = new Add();
                break;
        }
        return op;
    }
}
