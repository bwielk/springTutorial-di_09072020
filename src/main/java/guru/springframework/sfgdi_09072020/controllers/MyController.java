package guru.springframework.sfgdi_09072020.controllers;

import guru.springframework.sfgdi_09072020.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    //given there is no @Qualifier specified BUT there is a @Primary service defined, the bean of @Primary will be injected here
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.greeting();
    }

}
