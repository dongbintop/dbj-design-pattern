package create.factory.simple;

public class Client {

    public static void main(String[] args) {
        Operation op = SimpleFactory.createOpteration("+");
        System.out.println(op.calc(1, 2));
    }
}
