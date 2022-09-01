package reflection.annotation.assignment;

public class TodoDriver {
    public static void main(String[] args) {
        TodoAnalyzer todoAnalyzer = new TodoAnalyzer();
        System.out.println(todoAnalyzer.getTodoReport(TodoSamples.class));
    }
}
