package reflection.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class TestAnnoRunner {

    public void testAnnoRunner(Class clazz){
        Method[] methods = clazz.getDeclaredMethods(); //Get all methods.
        for (Method method : methods) {
            if (method.getAnnotation(TestAnno.class) != null) { //Get only methods having annotation as TestAnno
                if (!Modifier.isStatic(method.getModifiers())) { //Get only those methods which are non-static
                    try {
                        var obj = clazz.getConstructor().newInstance(); //Create instance of the Class in which the methods are contained.
                        var testAnnotation = method.getAnnotation(TestAnno.class);
                        if (!testAnnotation.expected().equals(TestAnno.None.class)) { //Check exception thrown by the method as None.class is thrown when no exception is thrown.
                            try {
                                method.invoke(obj); //Invoking the method on the object we created. Here we invoke the methods as it is required for the methods to be executed in this usecase.
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


            //Sample class for annotation is in TestAnnoUses and driver class to test the code is AnnotationDemo
        }
    }


}