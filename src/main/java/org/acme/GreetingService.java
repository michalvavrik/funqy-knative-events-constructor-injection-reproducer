package org.acme;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    public String sayHello() {
        return "Hello RESTEasy";
    }

}
