package create.factory.build;

public interface Builder<T, B> {
    B build();

    T from(B in);
}
