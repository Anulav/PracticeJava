package reflection.annotation.assignment;

import java.lang.reflect.Modifier;
import java.util.Arrays;

public class TodoAnalyzer {
    String getTodoReport(Class clazz) {
        StringBuilder todoReport = new StringBuilder();
        Arrays.stream(clazz.getDeclaredMethods()).filter(method -> method.getAnnotation(Todo.class) != null)
                .filter(method -> !Modifier.isStatic(method.getModifiers()))
                .forEach(method -> {
                    var todoAnnotation = method.getAnnotation(Todo.class);
                    todoReport.append("\nmethod name: "+ method+"\nauthor: "+ todoAnnotation.author()+"\nstatus: "+todoAnnotation.status()+"\n\n");

                });
        return todoReport.toString();
    }
}
