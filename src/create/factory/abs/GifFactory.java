package create.factory.abs;

import create.factory.method.GifReader;
import create.factory.method.Reader;

public class GifFactory implements IFactory {

    @Override
    public Reader getReader() {
        return new GifReader();
    }

    @Override
    public Writer getWriter() {
        return new GifWriter();
    }
}
