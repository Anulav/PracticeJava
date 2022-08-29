package reflection.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestAnno {
    Class<? extends Throwable> expected() default None.class;
    //This method can throw exception and the default exception is None.class;

    String name() default "";

    static class None extends Throwable{
        private None(){

        }
    }
}
