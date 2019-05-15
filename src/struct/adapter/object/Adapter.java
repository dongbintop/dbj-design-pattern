package struct.adapter.object;

import struct.adapter.Adaptee;
import struct.adapter.Target;

public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;

    }

    @Override
    public void method1() {
        this.adaptee.method();
    }

    @Override
    public void method2() {
        System.out.println("不适配");
    }
}
