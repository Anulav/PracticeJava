package oop.lsp.problem;

public class LiskovSubstitutionDemo {
    public static void main(String[] args) {
        Birds[] birds = {new Crow(),new Sparrow(), new Ostrich()};
        for (Birds bird:birds) {
            bird.fly(); //fly method invocation on Ostrich throws Unsupported Operation Exception.
                        //This is violation of Liskov Substitution Principle
        }
    }
}
