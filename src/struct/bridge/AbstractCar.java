package struct.bridge;

public abstract class AbstractCar {

    protected Transmission transmission;

    public AbstractCar(Transmission transmission) {
        this.transmission = transmission;
    }

    public abstract void run();
}
