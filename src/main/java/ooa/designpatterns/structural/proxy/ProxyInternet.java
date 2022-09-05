package ooa.designpatterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{

    private static List<String> bannedSites = new ArrayList<>();

    private final DefaultInternet defaultInternet = new DefaultInternet();

    static{
        bannedSites.add("facebook.com");
        bannedSites.add("instagram.com");
        bannedSites.add("twitter.com");
    }

    @Override
    public void connectToHost(String url) {
        if(bannedSites.contains(url)){
            System.out.println("The access to the url "+url+" is restricted");
        }else
            defaultInternet.connectToHost(url);
    }
}
