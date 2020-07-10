package guru.springframework.sfgdi_09072020.controllers;

import guru.springframework.sfgdi_09072020.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.greeting();
    }
}
