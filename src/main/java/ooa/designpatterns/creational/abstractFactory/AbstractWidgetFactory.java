package ooa.designpatterns.creational.abstractFactory;


public interface AbstractWidgetFactory {
    Window createWindow();
    Scroll createScroll();
    Button[] createNavigationButtons();
}
