package ooa.designpatterns.creational.abstractFactory;

public class GUIBuilder {
    public void buildWindow(AbstractWidgetFactory abstractWidgetFactory){
        abstractWidgetFactory.createWindow();
        abstractWidgetFactory.createScroll();
        abstractWidgetFactory.createNavigationButtons();
    }

}
