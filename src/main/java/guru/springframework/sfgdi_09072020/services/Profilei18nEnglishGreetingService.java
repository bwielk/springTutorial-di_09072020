package guru.springframework.sfgdi_09072020.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Qualifier("i18nService")
@Profile("EN")
public class Profilei18nEnglishGreetingService implements GreetingService {

    @Override
    public String greeting() {
        return  "----------------------------\n"
                +"Hello World! - ENGLISH SERVICE\n"
                +"----------------------------\n";
    }
}
