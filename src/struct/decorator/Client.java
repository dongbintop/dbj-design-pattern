package struct.decorator;

public class Client {

    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        System.out.println(beverage.description());
        System.out.println(beverage.cost());
    }
}
