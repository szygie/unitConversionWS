package net.ddns.szygie;

import javax.xml.ws.Endpoint;


public class UCPublisher {

    public static  void main (String args[]) {
        Endpoint.publish("http://localhost:8080/UC", new UCImpl());
    }
}
