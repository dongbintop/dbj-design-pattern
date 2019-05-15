package struct.bridge;

public class Client {

    public static void main(String[] args) {
        AbstractCar car = new BenCar(new Auto());
        car.run();
    }
}
