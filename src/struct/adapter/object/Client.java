package struct.adapter.object;

import struct.adapter.Adaptee;
import struct.adapter.Target;

public class Client {
    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.method1();
        target.method2();
    }
}
