package reflection.annotation;

public class TestAnnoUses {

    @TestAnno(name = "test without exception")
    public void shouldNotThrowException() {
        // method that doesn't throw exception
    }

    @TestAnno(name = "test with exception", expected = RuntimeException.class)
    public void shouldThrowException() {
        throw new RuntimeException();
    }
}
