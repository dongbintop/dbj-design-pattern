package struct.adapter.object;

import struct.adapter.Adatee;
import struct.adapter.Target;

public class Client {
    public static void main(String[] args) {
        Target target = new Adapter(new Adatee());
        target.method1();
        target.method2();
    }
}
