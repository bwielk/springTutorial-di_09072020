package guru.springframework.sfgdi_09072020.controllers;

import guru.springframework.sfgdi_09072020.services.GreetingService;

public class SetterBasedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.greeting();
    }
}
