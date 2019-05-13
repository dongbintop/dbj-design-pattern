package create.factory.abs;

import create.factory.method.PngReader;
import create.factory.method.Reader;

public class PngFactory implements IFactory {
    @Override
    public Reader getReader() {
        return new PngReader();
    }

    @Override
    public Writer getWriter() {
        return new PngWriter();
    }
}
