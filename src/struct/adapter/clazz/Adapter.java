package struct.adapter.clazz;

import struct.adapter.Adaptee;
import struct.adapter.Target;

public class Adapter extends Adaptee implements Target {

    @Override
    public void method1() {
        super.method();
    }

    @Override
    public void method2() {
        System.out.println("不适配");
    }
}
