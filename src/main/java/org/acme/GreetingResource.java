package org.acme;

import io.quarkus.funqy.Funq;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingResource {

    private final GreetingService greetingService;

    public GreetingResource(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Funq
    public String hello() {
        return greetingService.sayHello();
    }
}