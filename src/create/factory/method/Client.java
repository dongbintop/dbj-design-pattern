package create.factory.method;

public class Client {
    public static void main(String[] args) {
        ReaderFactory factory = new PngReaderFactory();
        Reader reader = factory.getReader();
        reader.read();
    }
}
