package reflection.annotation;

public class AnnotationDriver {
    public static void main(String[] args) {
        TestAnnoRunner runner = new TestAnnoRunner();
        runner.testAnnoRunner(TestAnnoUses.class);
    }
}
