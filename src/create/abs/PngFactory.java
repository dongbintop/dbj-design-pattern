package create.abs;

import create.method.PngReader;
import create.method.Reader;

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
