package create.factory.abs;

import create.factory.method.Reader;

public interface IFactory {
    Reader getReader();

    Writer getWriter();
}
