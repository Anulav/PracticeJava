package reflection.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) //Where we can use the annotation
@Retention(RetentionPolicy.RUNTIME) //Scope of the annotation
public @interface TestAnno {
    Class<? extends Throwable> expected() default None.class;
    //This method can throw exception and the default exception is None.class;

    String name() default ""; //Client method can pass any name

    static class None extends Throwable{
        private None(){

        }
    }
}


//Expected for exception to be thrown by method. Return type is Class. Return can be primitive Enums, Class
//Logic of this method is given in TestAnnoRunner
//Duplicated annotations support is added in the Java8