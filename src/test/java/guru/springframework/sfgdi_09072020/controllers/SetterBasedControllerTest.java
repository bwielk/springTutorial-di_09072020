package guru.springframework.sfgdi_09072020.controllers;

import guru.springframework.sfgdi_09072020.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterBasedControllerTest {

    private SetterBasedController setterBasedController;

    @BeforeEach
    void setUp() {
        setterBasedController = new SetterBasedController();
        setterBasedController.setGreetingService(new ConstructorInjectedGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(setterBasedController.getGreeting());
    }

}