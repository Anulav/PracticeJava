package reflection.annotation.assignment;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class TodoAnalyzer {
    String getTodoReport(Class clazz) {
        StringBuilder todoReport = new StringBuilder();
        Arrays.stream(clazz.getDeclaredMethods()).filter(method -> method.getAnnotation(Todo.class) != null)
                .filter(method -> !Modifier.isStatic(method.getModifiers()))
                .forEach(method -> {
                    try {
                        var obj = clazz.getDeclaredConstructor().newInstance();
                        var todoAnnotation = method.getAnnotation(Todo.class);
                        method.invoke(obj);
                        todoReport.append("\nmethod name: "+ method+"\nauthor: "+ todoAnnotation.author()+"\nstatus: "+todoAnnotation.status()+"\n\n");
                    } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException | InstantiationException e) {
                        e.printStackTrace();
                    }

                });
        return todoReport.toString();
    }
}
