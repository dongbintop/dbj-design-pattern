package create.abs;

import create.method.GifReader;
import create.method.Reader;

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
