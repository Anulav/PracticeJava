package reflection.annotation.repeatable;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR,ElementType.LOCAL_VARIABLE,
        ElementType.MODULE, ElementType.PACKAGE, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface Authors {

    Author[] value(); //As containers annotation must have "value" element that returns the annotation of the Repeatable type.
                      // In our case that is the Author array.
}
