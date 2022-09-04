package ooa.designpatterns.creational.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FArchiverFactory {
    private static Map<String, Supplier<FArchiver>> typeConstructorMap = new HashMap<>();

    static {
        typeConstructorMap.put("zip",FZipArchiver::new);
        typeConstructorMap.put("rar", FRarArchiver::new);
    }

    public static FArchiver getInstance(String archiverType) {
        return typeConstructorMap.get(archiverType) == null ? null : typeConstructorMap.get(archiverType).get();

        /* Here when we use the Supplier method is used and when we use the get method basically
            we call the supplier method hence new instances are created every time.
         */
    }
}
