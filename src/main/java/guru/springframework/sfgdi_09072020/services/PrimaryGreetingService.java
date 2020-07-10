package guru.springframework.sfgdi_09072020.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService{

    @Override
    public String greeting() {
        return "Hello World - PRIMARY GREETING SERVICE";
    }
}
