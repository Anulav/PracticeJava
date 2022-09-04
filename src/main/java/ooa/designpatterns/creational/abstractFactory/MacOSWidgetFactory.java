package ooa.designpatterns.creational.abstractFactory;

public class MacOSWidgetFactory implements AbstractWidgetFactory {
    @Override
    public MacWindow createWindow() {
        System.out.println("MacOS Window");
        return null;
    }

    @Override
    public MacScroll createScroll() {
        System.out.println("MacOS Scroll");
        return null;
    }

    @Override
    public MacButton[] createNavigationButtons() {
        System.out.println("MacOS Buttons");
        return new MacButton[0];
    }
}
