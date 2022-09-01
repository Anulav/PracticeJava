package reflection.annotation.assignment;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Todo {

    String author() default "";

    Priority priority() default Priority.LOW;

    Status status() default Status.NOT_STARTED;
}

