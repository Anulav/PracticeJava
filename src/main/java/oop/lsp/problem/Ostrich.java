package oop.lsp.problem;

public class Ostrich implements Birds{
    @Override
    public void fly() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void eat() {

    }
}
