package ooa.designpatterns.creational.factory;

import org.apache.commons.lang3.SerializationUtils;

import java.io.File;
import java.io.Serializable;

public class FRarArchiver implements FArchiver, Serializable {
    @Override
    public void archive(File directory) {
        System.out.println("Rar FArchiver");
    }

    @Override
    public FArchiver clone() {
        return SerializationUtils.clone(this);
    }
}


/*
*  Clone method from Java does only shallow cloning. Clones only references not the whole graph of data behind objects.
*
* */