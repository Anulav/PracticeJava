package ooa.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ArchiverFactory {
    private static Map<String, Archiver> prototypes = new HashMap<>();

    static {
        prototypes.put("zip", new ZipFArchiver());
        prototypes.put("rar", new RarFArchiver());
    }

    public static Archiver getPrototypeForType(String archiverType){
        return prototypes.get(archiverType).clone();
    }
}
