package guru.springframework.sfgdi_09072020.controllers;

import guru.springframework.sfgdi_09072020.services.ConstructorInjectedGreetingService;
import org.junit.Before;
import org.junit.Test;

public class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @Before
    public void before() {
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new ConstructorInjectedGreetingService();
    }

    @Test
    public void getGreeting(){
        System.out.println(propertyInjectedController.getGreeting());
    }

}