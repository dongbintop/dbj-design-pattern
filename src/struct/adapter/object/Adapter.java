package struct.adapter.object;

import struct.adapter.Adatee;
import struct.adapter.Target;

public class Adapter implements Target {

    private Adatee adatee;

    public Adapter(Adatee adatee) {
        this.adatee = adatee;

    }

    @Override
    public void method1() {
        this.adatee.method();
    }

    @Override
    public void method2() {
        System.out.println("不适配");
    }
}
