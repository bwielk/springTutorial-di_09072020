package guru.springframework.sfgdi_09072020.controllers;

import guru.springframework.sfgdi_09072020.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConsructorInjectedControllerTest {

    private ConsructorInjectedController consructorInjectedController;

    @BeforeEach
    private void setUp(){
        consructorInjectedController = new ConsructorInjectedController(new ConstructorInjectedGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(consructorInjectedController.getGreeting());
    }
}