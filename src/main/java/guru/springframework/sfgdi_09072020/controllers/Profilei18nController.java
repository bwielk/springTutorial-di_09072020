package guru.springframework.sfgdi_09072020.controllers;

import guru.springframework.sfgdi_09072020.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class Profilei18nController {

    private final GreetingService greetingService;

    @Autowired
    public Profilei18nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.greeting();
    }
}
