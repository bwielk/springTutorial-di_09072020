package guru.springframework.sfgdi_09072020.controllers;

import guru.springframework.sfgdi_09072020.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConsructorInjectedControllerTest {

    private ConstructorInjectedController consructorInjectedController;

    @BeforeEach
    private void setUp(){
        consructorInjectedController = new ConstructorInjectedController(new ConstructorInjectedGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(consructorInjectedController.getGreeting());
    }
}