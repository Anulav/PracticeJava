package ooa.designpatterns.creational.prototype;

import java.io.File;

public class ArchiverTest {
    public static void main(String[] args) {
        ZipArchiver zipArchiver = (ZipArchiver) ArchiverFactory.getPrototypeForType("zip");
        zipArchiver.archive(new File(""));

        RarArchiver rarArchiver = (RarArchiver) ArchiverFactory.getPrototypeForType("rar");
        rarArchiver.archive(new File(""));

    }
}
