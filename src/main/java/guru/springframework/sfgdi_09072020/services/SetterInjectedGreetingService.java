package guru.springframework.sfgdi_09072020.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService{

    @Override
    public String greeting() {
        return "Hello World - SETTER";
    }
}
