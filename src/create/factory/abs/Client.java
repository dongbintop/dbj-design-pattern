package create.factory.abs;

import create.factory.FactoryUtils;

public class Client {
    public static void main(String[] args) {

        IFactory factory = new PngFactory();
        factory.getReader().read();
        factory.getWriter().write();

        Reader reader = FactoryUtils.newInstance(PngReader.class);
        if (reader != null) {
            reader.read();
        }

    }
}
