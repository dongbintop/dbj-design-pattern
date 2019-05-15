package struct.bridge;

public class BMWCar extends AbstractCar {

    public BMWCar(Transmission transmission) {
        super(transmission);
    }

    @Override
    public void run() {
        transmission.gear();
        System.out.println("BWM is running");
    }
}
