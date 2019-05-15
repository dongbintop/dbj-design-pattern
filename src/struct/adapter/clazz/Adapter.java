package struct.adapter.clazz;

import struct.adapter.Adatee;
import struct.adapter.Target;

public class Adapter extends Adatee implements Target {

    @Override
    public void method1() {
        super.method();
    }

    @Override
    public void method2() {
        System.out.println("不适配");
    }
}
