package ooa.designpatterns.creational.factory;


import java.io.File;

public class FArchiverTest {
    public static void main(String[] args) {
        FZipArchiver zipArchiver = (FZipArchiver) FArchiverFactory.getInstance("zip");
        zipArchiver.archive(new File(""));

        FRarArchiver rarArchiver = (FRarArchiver) FArchiverFactory.getInstance("rar");
        rarArchiver.archive(new File(""));

        FZipArchiver zipArchiver2 = (FZipArchiver) FArchiverFactory.getInstance("zip");
        if(zipArchiver2.equals(zipArchiver)) {
            System.out.println("SAME");
        } else{
            System.out.println("NOT SAME");
        }

    }
}
