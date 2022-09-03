package ooa.designpatterns.creational.prototype;

import java.io.File;

public interface Archiver {
    void archive(File directory);

    Archiver clone();
}
