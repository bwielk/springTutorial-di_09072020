package guru.springframework.sfgdi_09072020.controllers;

import guru.springframework.sfgdi_09072020.services.GreetingService;
import guru.springframework.sfgdi_09072020.services.PropertyInjectedGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("propertyInjectedGreetingService")
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.greeting();
    }
}
