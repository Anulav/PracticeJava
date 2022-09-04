package ooa.designpatterns.creational.prototype;

import org.apache.commons.lang3.SerializationUtils;

import java.io.File;
import java.io.Serializable;

public class ZipFArchiver implements Archiver, Serializable {
    @Override
    public void archive(File directory) {
        System.out.println("Zip FArchiver");
    }

    @Override
    public Archiver clone() {
        return (Archiver) SerializationUtils.clone(this);
    }
}


/*
*  Clone method from Java does only shallow cloning. Clones only references not the whole graph of data behind objects.
*
* */