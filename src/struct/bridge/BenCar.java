package struct.bridge;

public class BenCar extends AbstractCar {

    public BenCar(Transmission transmission) {
        super(transmission);
    }

    @Override
    public void run() {
        transmission.gear();
        System.out.println("Ben is running");
    }
}
