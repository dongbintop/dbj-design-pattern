package create.singleton;

public class Singleton {

    private Singleton() {
    }

    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    private Singleton getInsatnce() {
        return SingletonInstance.INSTANCE;
    }
}
