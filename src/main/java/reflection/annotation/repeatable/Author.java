package reflection.annotation.repeatable;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR,ElementType.LOCAL_VARIABLE,
        ElementType.MODULE, ElementType.PACKAGE, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Authors.class) //Container required for the Author Annotation, we have Authors Annotation
public @interface Author {
    String name();
}
