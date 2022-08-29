package reflection.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class TestAnnoRunner {

    public void testAnnoRunner(Class clazz){
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getAnnotation(TestAnno.class) != null) {
                if (!Modifier.isStatic(method.getModifiers())) {
                    try {
                        var obj = clazz.getConstructor().newInstance();
                        var testAnnotation = method.getAnnotation(TestAnno.class);
                        if (!testAnnotation.expected().equals(TestAnno.None.class)) {
                            try {
                                method.invoke(obj);
                            } catch (InvocationTargetException ex) { /* In reflection the exception thrown while invoking method
                                                                     is wrapped around InvocationTargetException */
                                if (!ex.getCause().getClass().equals(testAnnotation.expected())) {
                                    System.out.println("Test with name \"" + testAnnotation.name() + " is failed.");
                                    continue;
                                }
                            }
                        } else {
                            method.invoke(obj);
                        }
                        System.out.println("Test with name \""
                                + testAnnotation.name() + "\" is passed successfully.");
                    } catch (InstantiationException | IllegalAccessException | IllegalArgumentException
                            | InvocationTargetException | NoSuchMethodException | SecurityException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }


}