package struct.bridge;

public class Manual implements Transmission {
    @Override
    public void gear() {
        System.out.println("手动挡");
    }
}
