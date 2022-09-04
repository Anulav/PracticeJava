package ooa.designpatterns.creational.prototype;

import java.io.File;

public class ArchiverTest {
    public static void main(String[] args) {
        ZipFArchiver zipArchiver = (ZipFArchiver) ArchiverFactory.getPrototypeForType("zip");
        zipArchiver.archive(new File(""));

        RarFArchiver rarArchiver = (RarFArchiver) ArchiverFactory.getPrototypeForType("rar");
        rarArchiver.archive(new File(""));

    }
}
