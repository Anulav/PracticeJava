package ooa.designpatterns.creational.abstractFactory;

public class WindowsWidgetFactory implements AbstractWidgetFactory {
    @Override
    public WindowsWindow createWindow() {
        System.out.println("Windows Window");
        return null;
    }

    @Override
    public WindowsScroll createScroll() {
        System.out.println("Windows Scroll");
        return null;
    }

    @Override
    public WindowsButton[] createNavigationButtons() {
        System.out.println("Windows Buttons");
        return new WindowsButton[0];
    }
}
