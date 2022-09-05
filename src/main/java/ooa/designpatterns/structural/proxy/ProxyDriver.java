package ooa.designpatterns.structural.proxy;

public class ProxyDriver {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        internet.connectToHost("facebook.com");
        internet.connectToHost("instagram.com");
        internet.connectToHost("google.com");
    }
}
