package create.abs;

import create.method.Reader;

public interface IFactory {
    Reader getReader();

    Writer getWriter();
}
