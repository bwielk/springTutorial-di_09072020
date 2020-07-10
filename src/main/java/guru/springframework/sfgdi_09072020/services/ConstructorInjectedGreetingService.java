package guru.springframework.sfgdi_09072020.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingService implements GreetingService {

    @Override
    public String greeting() {
        return "Hello world - CONSTRUCTOR";
    }
}
