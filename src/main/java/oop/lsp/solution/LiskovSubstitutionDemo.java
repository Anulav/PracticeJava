package oop.lsp.solution;

public class LiskovSubstitutionDemo {
    public static void main(String[] args) {
        Birds[] birds = {new Crow(),new Sparrow(), new Ostrich()};
        for (Birds bird:birds) {
            bird.eat();
        }

        FlyingBirds[] flyingBirds = {new Crow(), new Sparrow()};
        for (FlyingBirds flyBird: flyingBirds) {
            flyBird.fly();
        }
    }
}
