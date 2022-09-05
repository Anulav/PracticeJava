package ooa.designpatterns.structural.proxy;

public class DefaultInternet implements Internet{
    @Override
    public void connectToHost(String url) {
        System.out.println("Connection successful with "+url);
    }
}
