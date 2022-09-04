package ooa.designpatterns.creational.abstractFactory;

public class Driver {
    public static void main(String[] args) {
        var sys = "windows";
        GUIBuilder guiBuilder = new GUIBuilder();
        AbstractWidgetFactory abstractWidgetFactory = null;
        switch(sys) {
            case "windows": abstractWidgetFactory = new WindowsWidgetFactory();
                            break;
            case "MacOS": abstractWidgetFactory = new MacOSWidgetFactory();
                            break;
            default:

        }
        if(abstractWidgetFactory != null){
            guiBuilder.buildWindow(abstractWidgetFactory);
        }
    }
}
